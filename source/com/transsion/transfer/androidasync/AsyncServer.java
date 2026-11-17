package com.transsion.transfer.androidasync;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.transsion.transfer.androidasync.future.C19831n;
import com.transsion.transfer.androidasync.future.C19840w;
import com.transsion.transfer.androidasync.future.InterfaceC19818a;
import com.transsion.transfer.androidasync.future.InterfaceC19824g;
import com.transsion.transfer.androidasync.future.InterfaceC19842y;
import com.transsion.transfer.androidasync.future.InterfaceFutureC19823f;
import com.transsion.transfer.androidasync.util.C19953d;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p439gv.InterfaceC23678b;
import p439gv.InterfaceC23682f;
import p439gv.InterfaceC23684h;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncServer {

    /* JADX INFO: renamed from: g */
    static AsyncServer f63160g = new AsyncServer();

    /* JADX INFO: renamed from: h */
    private static ExecutorService f63161h = m82446A("AsyncServer-worker-");

    /* JADX INFO: renamed from: i */
    private static final Comparator f63162i = new Comparator<InetAddress>() { // from class: com.transsion.transfer.androidasync.AsyncServer.5
        @Override // java.util.Comparator
        public int compare(InetAddress inetAddress, InetAddress inetAddress2) {
            boolean z11 = inetAddress instanceof Inet4Address;
            if (z11 && (inetAddress2 instanceof Inet4Address)) {
                return 0;
            }
            if ((inetAddress instanceof Inet6Address) && (inetAddress2 instanceof Inet6Address)) {
                return 0;
            }
            return (z11 && (inetAddress2 instanceof Inet6Address)) ? -1 : 1;
        }
    };

    /* JADX INFO: renamed from: j */
    private static ExecutorService f63163j = m82446A("AsyncServer-resolver-");

    /* JADX INFO: renamed from: k */
    private static final ThreadLocal f63164k = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    private C19957x f63165a;

    /* JADX INFO: renamed from: b */
    String f63166b;

    /* JADX INFO: renamed from: c */
    boolean f63167c;

    /* JADX INFO: renamed from: d */
    int f63168d;

    /* JADX INFO: renamed from: e */
    PriorityQueue f63169e;

    /* JADX INFO: renamed from: f */
    Thread f63170f;

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncServer$7 */
    class RunnableC198007 implements Runnable {
        final /* synthetic */ AsyncDatagramSocket val$handler;
        final /* synthetic */ String val$host;
        final /* synthetic */ int val$port;
        final /* synthetic */ DatagramChannel val$socket;

        RunnableC198007(String str, int i11, AsyncDatagramSocket asyncDatagramSocket, DatagramChannel datagramChannel) {
            this.val$host = str;
            this.val$port = i11;
            this.val$handler = asyncDatagramSocket;
            this.val$socket = datagramChannel;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InetSocketAddress inetSocketAddress = new InetSocketAddress(this.val$host, this.val$port);
                AsyncServer.this.m82464s(this.val$handler);
                this.val$socket.connect(inetSocketAddress);
            } catch (IOException e11) {
                Log.e("NIO", "Datagram error", e11);
                C19953d.m82894a(this.val$socket);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncServer$9 */
    class RunnableC198029 implements Runnable {
        RunnableC198029() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncServer.this.f63165a == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key Count: ");
            sb2.append(AsyncServer.this.f63165a.m82907h().size());
            for (SelectionKey selectionKey : AsyncServer.this.f63165a.m82907h()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Key: ");
                sb3.append(selectionKey);
            }
        }
    }

    private static class AsyncSelectorException extends IOException {
        public AsyncSelectorException(Exception exc) {
            super(exc);
        }
    }

    private static class RunnableWrapper implements Runnable {
        Handler handler;
        boolean hasRun;
        Runnable runnable;
        ThreadQueue threadQueue;

        private RunnableWrapper() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (this.hasRun) {
                        return;
                    }
                    this.hasRun = true;
                    try {
                        this.runnable.run();
                    } finally {
                        this.threadQueue.remove(this);
                        this.handler.removeCallbacks(this);
                        this.threadQueue = null;
                        this.handler = null;
                        this.runnable = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class Scheduled implements InterfaceC19818a, Runnable {
        boolean cancelled;
        public Runnable runnable;
        public AsyncServer server;
        public long time;

        public Scheduled(AsyncServer asyncServer, Runnable runnable, long j11) {
            this.server = asyncServer;
            this.runnable = runnable;
            this.time = j11;
        }

        @Override // com.transsion.transfer.androidasync.future.InterfaceC19818a
        public boolean cancel() {
            boolean zRemove;
            synchronized (this.server) {
                zRemove = this.server.f63169e.remove(this);
                this.cancelled = zRemove;
            }
            return zRemove;
        }

        @Override // com.transsion.transfer.androidasync.future.InterfaceC19818a
        public boolean isCancelled() {
            return this.cancelled;
        }

        public boolean isDone() {
            boolean z11;
            synchronized (this.server) {
                try {
                    z11 = (this.cancelled || this.server.f63169e.contains(this)) ? false : true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.runnable.run();
        }
    }

    static class Scheduler implements Comparator<Scheduled> {
        public static Scheduler INSTANCE = new Scheduler();

        private Scheduler() {
        }

        @Override // java.util.Comparator
        public int compare(Scheduled scheduled, Scheduled scheduled2) {
            long j11 = scheduled.time;
            long j12 = scheduled2.time;
            if (j11 == j12) {
                return 0;
            }
            return j11 > j12 ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncServer$a */
    class C19803a implements InterfaceC19824g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC23678b f63175a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C19840w f63176b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InetSocketAddress f63177c;

        C19803a(InterfaceC23678b interfaceC23678b, C19840w c19840w, InetSocketAddress inetSocketAddress) {
            this.f63175a = interfaceC23678b;
            this.f63176b = c19840w;
            this.f63177c = inetSocketAddress;
        }

        @Override // com.transsion.transfer.androidasync.future.InterfaceC19824g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo82486a(Exception exc, InetAddress inetAddress) {
            if (exc == null) {
                this.f63176b.m82574E((C19804b) AsyncServer.this.m82478l(new InetSocketAddress(inetAddress, this.f63177c.getPort()), this.f63175a));
            } else {
                this.f63175a.mo82619a(exc, null);
                this.f63176b.m82575G(exc);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncServer$b */
    private class C19804b extends C19840w {

        /* JADX INFO: renamed from: f */
        SocketChannel f63179f;

        /* JADX INFO: renamed from: g */
        InterfaceC23678b f63180g;

        private C19804b() {
        }

        @Override // com.transsion.transfer.androidasync.future.C19831n
        protected void cancelCleanup() {
            super.cancelCleanup();
            try {
                SocketChannel socketChannel = this.f63179f;
                if (socketChannel != null) {
                    socketChannel.close();
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncServer$c */
    private static class ThreadFactoryC19805c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        private final ThreadGroup f63182a;

        /* JADX INFO: renamed from: b */
        private final AtomicInteger f63183b = new AtomicInteger(1);

        /* JADX INFO: renamed from: c */
        private final String f63184c;

        ThreadFactoryC19805c(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.f63182a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f63184c = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f63182a, runnable, this.f63184c + this.f63183b.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncServer$d */
    private static class C19806d {

        /* JADX INFO: renamed from: a */
        Object f63185a;

        private C19806d() {
        }
    }

    public AsyncServer() {
        this(null);
    }

    public AsyncServer(String str) {
        this.f63168d = 0;
        this.f63169e = new PriorityQueue(1, Scheduler.INSTANCE);
        this.f63166b = str == null ? "AsyncServer" : str;
    }

    /* JADX INFO: renamed from: A */
    private static ExecutorService m82446A(String str) {
        return new ThreadPoolExecutor(0, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC19805c(str));
    }

    /* JADX INFO: renamed from: F */
    private void m82447F() {
        synchronized (this) {
            try {
                C19957x c19957x = this.f63165a;
                if (c19957x != null) {
                    PriorityQueue priorityQueue = this.f63169e;
                    try {
                        try {
                            m82449I(this, c19957x, priorityQueue);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (AsyncSelectorException unused2) {
                        c19957x.m82906d().close();
                        return;
                    }
                }
                try {
                    final C19957x c19957x2 = new C19957x(SelectorProvider.provider().openSelector());
                    this.f63165a = c19957x2;
                    final PriorityQueue priorityQueue2 = this.f63169e;
                    Thread thread = new Thread(this.f63166b) { // from class: com.transsion.transfer.androidasync.AsyncServer.8
                        @Override // java.lang.Thread, java.lang.Runnable
                        public void run() {
                            try {
                                AsyncServer.f63164k.set(AsyncServer.this);
                                AsyncServer.m82448G(AsyncServer.this, c19957x2, priorityQueue2);
                            } finally {
                                AsyncServer.f63164k.remove();
                            }
                        }
                    };
                    this.f63170f = thread;
                    thread.start();
                } catch (IOException e11) {
                    throw new RuntimeException("unable to create selector?", e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static void m82448G(AsyncServer asyncServer, C19957x c19957x, PriorityQueue priorityQueue) {
        while (true) {
            try {
                m82449I(asyncServer, c19957x, priorityQueue);
            } catch (AsyncSelectorException e11) {
                boolean z11 = e11.getCause() instanceof ClosedSelectorException;
                C19953d.m82894a(c19957x);
            }
            synchronized (asyncServer) {
                try {
                    if (!c19957x.isOpen() || (c19957x.m82907h().size() <= 0 && priorityQueue.size() <= 0)) {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        m82450J(c19957x);
        if (asyncServer.f63165a == c19957x) {
            asyncServer.f63169e = new PriorityQueue(1, Scheduler.INSTANCE);
            asyncServer.f63165a = null;
            asyncServer.f63170f = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r3v18, types: [gv.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.nio.channels.SelectionKey] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.nio.channels.SelectionKey] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [gv.f] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.transsion.transfer.androidasync.AsyncServer$b, com.transsion.transfer.androidasync.future.w] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.nio.channels.SelectionKey] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.transsion.transfer.androidasync.AsyncNetworkSocket, com.transsion.transfer.androidasync.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.transsion.transfer.androidasync.AsyncNetworkSocket, com.transsion.transfer.androidasync.j, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: I */
    private static void m82449I(AsyncServer asyncServer, C19957x c19957x, PriorityQueue priorityQueue) throws AsyncSelectorException {
        ?? r11;
        ?? r12;
        long jM82469z = m82469z(asyncServer, priorityQueue);
        try {
            synchronized (asyncServer) {
                try {
                    if (c19957x.m82910m() != 0) {
                        r11 = false;
                    } else if (c19957x.m82907h().size() == 0 && jM82469z == Long.MAX_VALUE) {
                        return;
                    } else {
                        r11 = true;
                    }
                    if (r11 != false) {
                        if (jM82469z == Long.MAX_VALUE) {
                            c19957x.m82908k();
                        } else {
                            c19957x.m82909l(jM82469z);
                        }
                    }
                    Set<??> setM82911n = c19957x.m82911n();
                    for (?? r13 : setM82911n) {
                        try {
                            SocketChannel socketChannel = null;
                            ?? Register = 0;
                            if (r13.isAcceptable()) {
                                try {
                                    SocketChannel socketChannelAccept = ((ServerSocketChannel) r13.channel()).accept();
                                    if (socketChannelAccept != null) {
                                        try {
                                            socketChannelAccept.configureBlocking(false);
                                            socketChannelAccept.socket().setKeepAlive(true);
                                            socketChannelAccept.socket().setTcpNoDelay(true);
                                            socketChannelAccept.socket().setSoLinger(true, 0);
                                            Register = socketChannelAccept.register(c19957x.m82906d(), 1);
                                            ?? r14 = (InterfaceC23682f) r13.attachment();
                                            ?? asyncNetworkSocket = new AsyncNetworkSocket();
                                            asyncNetworkSocket.m82415f(socketChannelAccept, (InetSocketAddress) socketChannelAccept.socket().getRemoteSocketAddress());
                                            asyncNetworkSocket.m82429y(asyncServer, Register);
                                            Register.attach(asyncNetworkSocket);
                                            r14.mo82780t(asyncNetworkSocket);
                                        } catch (IOException unused) {
                                            r12 = Register;
                                            socketChannel = socketChannelAccept;
                                            C19953d.m82894a(socketChannel);
                                            if (r12 != 0) {
                                                r12.cancel();
                                            }
                                        }
                                    }
                                } catch (IOException unused2) {
                                    r12 = 0;
                                }
                            } else if (r13.isReadable()) {
                                asyncServer.m82470B(((AsyncNetworkSocket) r13.attachment()).m82421o());
                            } else if (r13.isWritable()) {
                                ((AsyncNetworkSocket) r13.attachment()).m82420n();
                            } else {
                                if (!r13.isConnectable()) {
                                    throw new RuntimeException("Unknown key state.");
                                }
                                ?? r15 = (C19804b) r13.attachment();
                                SocketChannel socketChannel2 = (SocketChannel) r13.channel();
                                r13.interestOps(1);
                                try {
                                    socketChannel2.finishConnect();
                                    ?? asyncNetworkSocket2 = new AsyncNetworkSocket();
                                    asyncNetworkSocket2.m82429y(asyncServer, r13);
                                    asyncNetworkSocket2.m82415f(socketChannel2, (InetSocketAddress) socketChannel2.socket().getRemoteSocketAddress());
                                    r13.attach(asyncNetworkSocket2);
                                    if (r15.m82577J(asyncNetworkSocket2)) {
                                        r15.f63180g.mo82619a(null, asyncNetworkSocket2);
                                    }
                                } catch (IOException e11) {
                                    r13.cancel();
                                    C19953d.m82894a(socketChannel2);
                                    if (r15.m82575G(e11)) {
                                        r15.f63180g.mo82619a(e11, null);
                                    }
                                }
                            }
                        } catch (CancelledKeyException unused3) {
                        }
                    }
                    setM82911n.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e12) {
            throw new AsyncSelectorException(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static void m82450J(C19957x c19957x) {
        m82451K(c19957x);
        C19953d.m82894a(c19957x);
    }

    /* JADX INFO: renamed from: K */
    private static void m82451K(C19957x c19957x) {
        try {
            for (SelectionKey selectionKey : c19957x.m82907h()) {
                C19953d.m82894a(selectionKey.channel());
                try {
                    selectionKey.cancel();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: N */
    private static void m82452N(final C19957x c19957x) {
        f63161h.execute(new Runnable() { // from class: com.transsion.transfer.androidasync.e
            @Override // java.lang.Runnable
            public final void run() {
                AsyncServer.m82468x(c19957x);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static AsyncServer m82463r() {
        return f63160g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m82464s(AsyncNetworkSocket asyncNetworkSocket) {
        SelectionKey selectionKeyMo82876i = asyncNetworkSocket.m82418k().mo82876i(this.f63165a.m82906d());
        selectionKeyMo82876i.attach(asyncNetworkSocket);
        asyncNetworkSocket.m82429y(this, selectionKeyMo82876i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ InetAddress m82465u(InetAddress[] inetAddressArr) {
        return inetAddressArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m82466v(Runnable runnable, Semaphore semaphore) {
        runnable.run();
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m82467w(C19957x c19957x) {
        try {
            c19957x.m82913p();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m82468x(C19957x c19957x) {
        try {
            c19957x.m82913p();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z */
    private static long m82469z(AsyncServer asyncServer, PriorityQueue priorityQueue) {
        Scheduled scheduled;
        long j11 = Long.MAX_VALUE;
        while (true) {
            synchronized (asyncServer) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    scheduled = null;
                    if (priorityQueue.size() > 0) {
                        Scheduled scheduled2 = (Scheduled) priorityQueue.remove();
                        long j12 = scheduled2.time;
                        if (j12 <= jElapsedRealtime) {
                            scheduled = scheduled2;
                        } else {
                            priorityQueue.add(scheduled2);
                            j11 = j12 - jElapsedRealtime;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (scheduled == null) {
                asyncServer.f63168d = 0;
                return j11;
            }
            scheduled.run();
        }
    }

    /* JADX INFO: renamed from: B */
    protected void m82470B(int i11) {
    }

    /* JADX INFO: renamed from: C */
    protected void m82471C(int i11) {
    }

    /* JADX INFO: renamed from: D */
    public InterfaceC19818a m82472D(Runnable runnable) {
        return m82473E(runnable, 0L);
    }

    /* JADX INFO: renamed from: E */
    public InterfaceC19818a m82473E(Runnable runnable, long j11) {
        synchronized (this) {
            try {
                if (this.f63167c) {
                    return C19831n.CANCELLED;
                }
                long jMin = 0;
                if (j11 > 0) {
                    jMin = SystemClock.elapsedRealtime() + j11;
                } else if (j11 == 0) {
                    int i11 = this.f63168d;
                    this.f63168d = i11 + 1;
                    jMin = i11;
                } else if (this.f63169e.size() > 0) {
                    jMin = Math.min(0L, ((Scheduled) this.f63169e.peek()).time - 1);
                }
                PriorityQueue priorityQueue = this.f63169e;
                Scheduled scheduled = new Scheduled(this, runnable, jMin);
                priorityQueue.add(scheduled);
                if (this.f63165a == null) {
                    m82447F();
                }
                if (!m82484t()) {
                    m82452N(this.f63165a);
                }
                return scheduled;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m82474H(final Runnable runnable) {
        if (Thread.currentThread() == this.f63170f) {
            m82472D(runnable);
            m82469z(this, this.f63169e);
            return;
        }
        synchronized (this) {
            try {
                if (this.f63167c) {
                    return;
                }
                final Semaphore semaphore = new Semaphore(0);
                m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AsyncServer.m82466v(runnable, semaphore);
                    }
                });
                try {
                    semaphore.acquire();
                } catch (InterruptedException e11) {
                    Log.e("NIO", "run", e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m82475L() {
        m82476M(false);
    }

    /* JADX INFO: renamed from: M */
    public void m82476M(boolean z11) {
        synchronized (this) {
            try {
                boolean zM82484t = m82484t();
                final C19957x c19957x = this.f63165a;
                if (c19957x == null) {
                    return;
                }
                final Semaphore semaphore = new Semaphore(0);
                this.f63169e.add(new Scheduled(this, new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncServer.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AsyncServer.m82450J(c19957x);
                        semaphore.release();
                    }
                }, 0L));
                f63161h.execute(new Runnable() { // from class: com.transsion.transfer.androidasync.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        AsyncServer.m82467w(c19957x);
                    }
                });
                m82451K(c19957x);
                this.f63169e = new PriorityQueue(1, Scheduler.INSTANCE);
                this.f63165a = null;
                this.f63170f = null;
                if (zM82484t || !z11) {
                    return;
                }
                try {
                    semaphore.acquire();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public C19804b m82477k(InetSocketAddress inetSocketAddress, InterfaceC23678b interfaceC23678b, InterfaceC23684h interfaceC23684h) {
        C19804b c19804b = new C19804b();
        m82472D(new Runnable(c19804b, interfaceC23678b, interfaceC23684h, inetSocketAddress) { // from class: com.transsion.transfer.androidasync.AsyncServer.3
            final /* synthetic */ InetSocketAddress val$address;
            final /* synthetic */ InterfaceC23678b val$callback;
            final /* synthetic */ C19804b val$cancel;
            final /* synthetic */ InterfaceC23684h val$createCallback;

            {
                this.val$address = inetSocketAddress;
            }

            @Override // java.lang.Runnable
            public void run() {
                SocketChannel socketChannelOpen;
                if (this.val$cancel.isCancelled()) {
                    return;
                }
                C19804b c19804b2 = this.val$cancel;
                c19804b2.f63180g = this.val$callback;
                SelectionKey selectionKeyRegister = null;
                try {
                    socketChannelOpen = SocketChannel.open();
                    c19804b2.f63179f = socketChannelOpen;
                    try {
                        socketChannelOpen.configureBlocking(false);
                        selectionKeyRegister = socketChannelOpen.register(AsyncServer.this.f63165a.m82906d(), 8);
                        selectionKeyRegister.attach(this.val$cancel);
                        socketChannelOpen.connect(this.val$address);
                    } catch (Throwable th2) {
                        th = th2;
                        if (selectionKeyRegister != null) {
                            selectionKeyRegister.cancel();
                        }
                        C19953d.m82894a(socketChannelOpen);
                        this.val$cancel.m82575G(new RuntimeException(th));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    socketChannelOpen = null;
                }
            }
        });
        return c19804b;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC19818a m82478l(InetSocketAddress inetSocketAddress, InterfaceC23678b interfaceC23678b) {
        return m82477k(inetSocketAddress, interfaceC23678b, null);
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC19818a m82479m(String str, int i11, InterfaceC23678b interfaceC23678b) {
        return m82480n(InetSocketAddress.createUnresolved(str, i11), interfaceC23678b);
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC19818a m82480n(InetSocketAddress inetSocketAddress, InterfaceC23678b interfaceC23678b) {
        if (!inetSocketAddress.isUnresolved()) {
            return m82478l(inetSocketAddress, interfaceC23678b);
        }
        C19840w c19840w = new C19840w();
        InterfaceFutureC19823f interfaceFutureC19823fM82483q = m82483q(inetSocketAddress.getHostName());
        c19840w.setParent(interfaceFutureC19823fM82483q);
        interfaceFutureC19823fM82483q.mo82539f(new C19803a(interfaceC23678b, c19840w, inetSocketAddress));
        return c19840w;
    }

    /* JADX INFO: renamed from: o */
    public Thread m82481o() {
        return this.f63170f;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceFutureC19823f m82482p(final String str) {
        final C19840w c19840w = new C19840w();
        f63163j.execute(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncServer.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final InetAddress[] allByName = InetAddress.getAllByName(str);
                    Arrays.sort(allByName, AsyncServer.f63162i);
                    if (allByName == null || allByName.length == 0) {
                        throw new HostnameResolutionException("no addresses for host");
                    }
                    AsyncServer.this.m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncServer.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c19840w.m82576H(null, allByName);
                        }
                    });
                } catch (Exception e11) {
                    AsyncServer.this.m82472D(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncServer.6.2
                        @Override // java.lang.Runnable
                        public void run() {
                            c19840w.m82576H(e11, null);
                        }
                    });
                }
            }
        });
        return c19840w;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceFutureC19823f m82483q(String str) {
        return m82482p(str).mo82540h(new InterfaceC19842y() { // from class: com.transsion.transfer.androidasync.g
            @Override // com.transsion.transfer.androidasync.future.InterfaceC19842y
            public final Object then(Object obj) {
                return AsyncServer.m82465u((InetAddress[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public boolean m82484t() {
        return this.f63170f == Thread.currentThread();
    }

    /* JADX INFO: renamed from: y */
    public InterfaceC19930i m82485y(final InetAddress inetAddress, final int i11, final InterfaceC23682f interfaceC23682f) {
        final C19806d c19806d = new C19806d();
        m82474H(new Runnable() { // from class: com.transsion.transfer.androidasync.AsyncServer.2

            /* JADX INFO: renamed from: com.transsion.transfer.androidasync.AsyncServer$2$a */
            class a implements InterfaceC19930i {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ ServerSocketChannel f63171a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C19958y f63172b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ SelectionKey f63173c;

                a(ServerSocketChannel serverSocketChannel, C19958y c19958y, SelectionKey selectionKey) {
                    this.f63171a = serverSocketChannel;
                    this.f63172b = c19958y;
                    this.f63173c = selectionKey;
                }

                @Override // com.transsion.transfer.androidasync.InterfaceC19930i
                public void stop() {
                    C19953d.m82894a(this.f63172b);
                    try {
                        this.f63173c.cancel();
                    } catch (Exception unused) {
                    }
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                C19958y c19958y;
                IOException e11;
                ServerSocketChannel serverSocketChannelOpen;
                try {
                    serverSocketChannelOpen = ServerSocketChannel.open();
                    try {
                        c19958y = new C19958y(serverSocketChannelOpen);
                        try {
                            serverSocketChannelOpen.socket().bind(inetAddress == null ? new InetSocketAddress(i11) : new InetSocketAddress(inetAddress, i11));
                            SelectionKey selectionKeyMo82876i = c19958y.mo82876i(AsyncServer.this.f63165a.m82906d());
                            selectionKeyMo82876i.attach(interfaceC23682f);
                            InterfaceC23682f interfaceC23682f2 = interfaceC23682f;
                            C19806d c19806d2 = c19806d;
                            a aVar = new a(serverSocketChannelOpen, c19958y, selectionKeyMo82876i);
                            c19806d2.f63185a = aVar;
                            interfaceC23682f2.mo82779o(aVar);
                        } catch (IOException e12) {
                            e11 = e12;
                            Log.e("NIO", "wtf", e11);
                            C19953d.m82894a(c19958y, serverSocketChannelOpen);
                            interfaceC23682f.mo82442g(e11);
                        }
                    } catch (IOException e13) {
                        c19958y = null;
                        e11 = e13;
                    }
                } catch (IOException e14) {
                    c19958y = null;
                    e11 = e14;
                    serverSocketChannelOpen = null;
                }
            }
        });
        return (InterfaceC19930i) c19806d.f63185a;
    }
}
