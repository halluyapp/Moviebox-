package com.transsion.transfer.impl.client;

import com.transsion.transfer.androidasync.future.InterfaceFutureC19823f;
import com.transsion.transfer.androidasync.http.AsyncHttpClient;
import com.transsion.transfer.androidasync.http.C19890h;
import com.transsion.transfer.androidasync.http.InterfaceC19893k;
import com.transsion.transfer.impl.InterfaceC20012f;
import com.transsion.transfer.impl.TaskState;
import com.transsion.transfer.impl.entity.FileData;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import p662ov.AbstractC26736a;
import p662ov.C26740e;

/* JADX INFO: renamed from: com.transsion.transfer.impl.client.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C20005o {

    /* JADX INFO: renamed from: r */
    public static final a f63754r = new a(null);

    /* JADX INFO: renamed from: a */
    private final AsyncHttpClient f63755a;

    /* JADX INFO: renamed from: b */
    private final String f63756b;

    /* JADX INFO: renamed from: c */
    private final String f63757c;

    /* JADX INFO: renamed from: d */
    private final String f63758d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC20012f f63759e;

    /* JADX INFO: renamed from: f */
    private final Function2 f63760f;

    /* JADX INFO: renamed from: g */
    private boolean f63761g;

    /* JADX INFO: renamed from: h */
    private InterfaceFutureC19823f f63762h;

    /* JADX INFO: renamed from: i */
    private long f63763i;

    /* JADX INFO: renamed from: j */
    private final List f63764j;

    /* JADX INFO: renamed from: k */
    private final List f63765k;

    /* JADX INFO: renamed from: l */
    private final List f63766l;

    /* JADX INFO: renamed from: m */
    private final List f63767m;

    /* JADX INFO: renamed from: n */
    private final Map f63768n;

    /* JADX INFO: renamed from: o */
    private boolean f63769o;

    /* JADX INFO: renamed from: p */
    private Long f63770p;

    /* JADX INFO: renamed from: q */
    private final c f63771q;

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.o$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.o$b */
    public static final class b extends AsyncHttpClient.AbstractC19855g {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ FileData f63773b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f63774c;

        b(FileData fileData, long j11) {
            this.f63773b = fileData;
            this.f63774c = j11;
        }

        @Override // com.transsion.transfer.androidasync.http.AsyncHttpClient.AbstractC19857i, p496iv.InterfaceC24230b
        /* JADX INFO: renamed from: a */
        public void mo82630a(InterfaceC19893k interfaceC19893k, long j11, long j12) {
            if (C20005o.this.f63761g && interfaceC19893k != null) {
                interfaceC19893k.close();
            }
            super.mo82630a(interfaceC19893k, j11, j12);
            if (System.currentTimeMillis() - C20005o.this.f63763i < 2000) {
                return;
            }
            C20005o.this.f63763i = System.currentTimeMillis();
            InterfaceC20012f interfaceC20012f = C20005o.this.f63759e;
            String fileRemotePath = this.f63773b.getFileRemotePath();
            long j13 = this.f63774c;
            interfaceC20012f.mo82943C(fileRemotePath, j11 + j13, j12 + j13);
        }

        @Override // com.transsion.transfer.androidasync.http.AsyncHttpClient.AbstractC19857i, p496iv.InterfaceC24230b
        /* JADX INFO: renamed from: b */
        public void mo82631b(InterfaceC19893k interfaceC19893k) {
            C20005o.this.f63759e.mo82944J(this.f63773b.getFileRemotePath(), TaskState.TRANSFERRING, this.f63774c, this.f63773b.getFileSize(), 0L, null);
        }

        @Override // p439gv.InterfaceC23683g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo83175c(Exception exc, InterfaceC19893k interfaceC19893k, File file) throws UnsupportedEncodingException {
            C20005o.this.f63769o = false;
            C20005o.this.f63771q.m83212a(this.f63773b, interfaceC19893k != null ? Integer.valueOf(interfaceC19893k.mo82722b()) : null, exc);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.client.o$c */
    public static final class c implements Function3 {
        c() {
        }

        /* JADX WARN: Code duplicated, block: B:35:0x017c  */
        /* JADX WARN: Code duplicated, block: B:38:0x018e  */
        /* JADX WARN: Code duplicated, block: B:44:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:51:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:54:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:55:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:58:0x020a  */
        /* JADX WARN: Code duplicated, block: B:60:0x020f  */
        /* JADX WARN: Code duplicated, block: B:68:0x01a4 A[SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public void m83212a(FileData data, Integer num, Exception exc) throws UnsupportedEncodingException {
            Iterator it;
            Object next;
            FileData fileData;
            TaskState taskState;
            String message;
            Intrinsics.m97802h(data, "data");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l11 = C20005o.this.f63770p;
            long jLongValue = jCurrentTimeMillis - (l11 != null ? l11.longValue() : 0L);
            Object obj = null;
            C20005o.this.f63770p = null;
            if (exc == null) {
                IntRange intRange = new IntRange(200, 299);
                if (num == null || !intRange.m97911o(num.intValue())) {
                    it = C20005o.this.f63765k.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.m97797c(((FileData) next).getFileRemotePath(), data.getFileRemotePath()));
                    fileData = (FileData) next;
                    if (fileData != null) {
                        C20005o c20005o = C20005o.this;
                        c20005o.f63765k.remove(fileData);
                        c20005o.f63766l.add(fileData);
                        InterfaceC20012f interfaceC20012f = c20005o.f63759e;
                        String fileRemotePath = fileData.getFileRemotePath();
                        if (num == null && num.intValue() == 404) {
                            taskState = TaskState.NO_FILE;
                        } else {
                            taskState = TaskState.ERROR;
                        }
                        TaskState taskState2 = taskState;
                        long length = new File(fileData.getFileReceiveCachePath()).length();
                        long fileSize = fileData.getFileSize();
                        if (exc != null) {
                            message = exc.getMessage();
                        } else {
                            message = null;
                        }
                        interfaceC20012f.mo82944J(fileRemotePath, taskState2, length, fileSize, jLongValue, "errorCode:" + num + ", errorMsg:" + message);
                    }
                    if (exc != null) {
                        exc.printStackTrace();
                    }
                    String message2 = exc != null ? exc.getMessage() : null;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("invoke: send file error:");
                    sb2.append(message2);
                    sb2.append(", skip it and send next");
                } else {
                    for (Object obj2 : C20005o.this.f63765k) {
                        if (Intrinsics.m97797c(((FileData) obj2).getFileRemotePath(), data.getFileRemotePath())) {
                            obj = obj2;
                            break;
                        }
                    }
                    FileData fileData2 = (FileData) obj;
                    if (fileData2 != null) {
                        File finalFile = fileData2.getFinalFile();
                        C20005o.this.f63765k.remove(fileData2);
                        if (fileData2.verifyFile()) {
                            C26740e c26740e = new C26740e(fileData2);
                            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                            String name = C26740e.class.getName();
                            Intrinsics.m97801g(name, "getName(...)");
                            flowEventBus.postEvent(name, c26740e, 0L);
                            C20005o.this.f63767m.add(fileData2);
                            C20005o.this.f63759e.mo82944J(fileData2.getFileRemotePath(), TaskState.FINISH, finalFile.length(), fileData2.getFileSize(), jLongValue, null);
                            Function2 function2 = C20005o.this.f63760f;
                            List list = C20005o.this.f63767m;
                            ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((FileData) it2.next()).getFileRemotePath());
                            }
                            function2.invoke(CollectionsKt.m97343U0(arrayList), Boolean.valueOf(C20005o.this.f63764j.isEmpty()));
                        } else {
                            Integer num2 = (Integer) C20005o.this.f63768n.get(fileData2.getFileRemotePath());
                            int iIntValue = num2 != null ? num2.intValue() : 0;
                            if (iIntValue > 1) {
                                C20005o.this.f63759e.mo82944J(fileData2.getFileRemotePath(), TaskState.ERROR, fileData2.getDownloadedSize(), fileData2.getFileSize(), jLongValue, "verify file failed");
                                long fileSize2 = fileData2.getFileSize();
                                long length2 = finalFile.length();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("invoke: verify file fail，fileSize:");
                                sb3.append(fileSize2);
                                sb3.append(", saveFile.size:");
                                sb3.append(length2);
                                sb3.append(", and delete cache file ,and retry");
                                fileData2.clearFile();
                            } else {
                                C20005o.this.f63768n.put(fileData2.getFileRemotePath(), Integer.valueOf(iIntValue + 1));
                                C20005o.this.f63765k.add(fileData2);
                            }
                        }
                    }
                }
            } else {
                it = C20005o.this.f63765k.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.m97797c(((FileData) next).getFileRemotePath(), data.getFileRemotePath()));
                fileData = (FileData) next;
                if (fileData != null) {
                    C20005o c20005o2 = C20005o.this;
                    c20005o2.f63765k.remove(fileData);
                    c20005o2.f63766l.add(fileData);
                    InterfaceC20012f interfaceC20012f2 = c20005o2.f63759e;
                    String fileRemotePath2 = fileData.getFileRemotePath();
                    if (num == null) {
                        taskState = TaskState.ERROR;
                    } else {
                        taskState = TaskState.NO_FILE;
                    }
                    TaskState taskState3 = taskState;
                    long length3 = new File(fileData.getFileReceiveCachePath()).length();
                    long fileSize3 = fileData.getFileSize();
                    if (exc != null) {
                        message = exc.getMessage();
                    } else {
                        message = null;
                    }
                    interfaceC20012f2.mo82944J(fileRemotePath2, taskState3, length3, fileSize3, jLongValue, "errorCode:" + num + ", errorMsg:" + message);
                }
                if (exc != null) {
                    exc.printStackTrace();
                }
                if (exc != null) {
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("invoke: send file error:");
                sb4.append(message2);
                sb4.append(", skip it and send next");
            }
            C20005o.this.m83206r();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws UnsupportedEncodingException {
            m83212a((FileData) obj, (Integer) obj2, (Exception) obj3);
            return Unit.f75682a;
        }
    }

    public C20005o(AsyncHttpClient httpClient, String clientIp, String transferId, String urlPath, InterfaceC20012f listener, Function2 completeListener) {
        Intrinsics.m97802h(httpClient, "httpClient");
        Intrinsics.m97802h(clientIp, "clientIp");
        Intrinsics.m97802h(transferId, "transferId");
        Intrinsics.m97802h(urlPath, "urlPath");
        Intrinsics.m97802h(listener, "listener");
        Intrinsics.m97802h(completeListener, "completeListener");
        this.f63755a = httpClient;
        this.f63756b = clientIp;
        this.f63757c = transferId;
        this.f63758d = urlPath;
        this.f63759e = listener;
        this.f63760f = completeListener;
        this.f63764j = new ArrayList();
        this.f63765k = new ArrayList();
        this.f63766l = new ArrayList();
        this.f63767m = new ArrayList();
        this.f63768n = new LinkedHashMap();
        this.f63770p = 0L;
        this.f63771q = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m83206r() throws UnsupportedEncodingException {
        if (this.f63761g) {
            return;
        }
        if (this.f63765k.isEmpty() && !this.f63764j.isEmpty()) {
            this.f63765k.add(this.f63764j.remove(0));
        }
        if (this.f63765k.isEmpty() || this.f63769o) {
            return;
        }
        m83207s((FileData) this.f63765k.get(0));
    }

    /* JADX INFO: renamed from: s */
    private final void m83207s(FileData fileData) throws UnsupportedEncodingException {
        File parentFile = new File(fileData.getFileReceiveCachePath()).getParentFile();
        if ((parentFile != null ? parentFile.getFreeSpace() : 0L) < fileData.getFileSize()) {
            this.f63759e.mo82944J(fileData.getFileRemotePath(), TaskState.SPACE_LIMIT, 0L, fileData.getFileSize(), 0L, null);
            this.f63765k.remove(fileData);
            m83206r();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("receiveFile:start:");
        sb2.append(fileData);
        sb2.append(" ");
        this.f63769o = true;
        FileData.Companion companion = FileData.INSTANCE;
        TaskState taskState = TaskState.CONNECTING;
        fileData.setState(companion.m83213a(taskState));
        fileData.filePrepare();
        File tempFile = fileData.getTempFile();
        File tempBackFile = tempFile.exists() ? fileData.getTempBackFile() : tempFile;
        long length = tempFile.exists() ? tempFile.length() : 0L;
        this.f63770p = Long.valueOf(System.currentTimeMillis());
        this.f63759e.mo82944J(fileData.getFileRemotePath(), taskState, length, fileData.getFileSize(), 0L, null);
        AsyncHttpClient asyncHttpClient = this.f63755a;
        C19890h c19890hM83166c = TransferClient.f63694t.m83166c(this.f63758d + "/client/fetchFile?file=" + AbstractC26736a.m104533b(fileData.getFileRemotePath()), this.f63756b, this.f63757c);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("transferFile: bytes=");
        sb3.append(length);
        sb3.append("-");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("transferFile: fileData=");
        sb4.append(fileData);
        c19890hM83166c.m82739h().m82633a("Range", "bytes=" + length + "-");
        Unit unit = Unit.f75682a;
        this.f63762h = asyncHttpClient.m82615t(c19890hM83166c, tempBackFile.getAbsolutePath(), new b(fileData, length));
    }

    /* JADX INFO: renamed from: p */
    public final void m83208p(List files) {
        Object obj;
        Object next;
        Intrinsics.m97802h(files, "files");
        this.f63761g = false;
        ArrayList arrayList = new ArrayList();
        List<FileData> list = files;
        for (FileData fileData : list) {
            Iterator it = this.f63765k.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(fileData.getFileRemotePath(), ((FileData) next).getFileRemotePath()));
            if (next == null) {
                for (Object obj2 : this.f63764j) {
                    if (Intrinsics.m97797c(fileData.getFileRemotePath(), ((FileData) obj2).getFileRemotePath())) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj != null) {
                }
            }
            arrayList.add(fileData);
        }
        if (!arrayList.isEmpty()) {
            files.removeAll(arrayList);
        }
        List list2 = this.f63764j;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.m97935e(MapsKt.m97550e(CollectionsKt.m97516v(list2, 10)), 16));
        for (Object obj3 : list2) {
            linkedHashMap.put(((FileData) obj3).getFileRemotePath(), obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.m97935e(MapsKt.m97550e(CollectionsKt.m97516v(list, 10)), 16));
        for (Object obj4 : list) {
            linkedHashMap2.put(((FileData) obj4).getFileRemotePath(), obj4);
        }
        List listR0 = CollectionsKt.m97340R0(MapsKt.m97580o(linkedHashMap, linkedHashMap2).values());
        this.f63764j.clear();
        this.f63764j.addAll(listR0);
        m83206r();
    }

    /* JADX INFO: renamed from: q */
    public final void m83209q() {
        InterfaceFutureC19823f interfaceFutureC19823f = this.f63762h;
        if (interfaceFutureC19823f != null) {
            interfaceFutureC19823f.cancel(true);
        }
        this.f63761g = true;
        this.f63765k.clear();
        this.f63764j.clear();
        this.f63767m.clear();
        this.f63766l.clear();
        this.f63768n.clear();
    }

    /* JADX INFO: renamed from: t */
    public final void m83210t(FileData fileData) {
        if (fileData != null) {
            if (!this.f63765k.contains(fileData)) {
                this.f63764j.remove(fileData);
            }
            this.f63765k.remove(fileData);
            this.f63765k.add(0, fileData);
        }
        m83206r();
    }
}
