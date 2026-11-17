.class public final Lcom/transsion/player/orplayer/r;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/transsion/player/orplayer/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/transsion/player/orplayer/r$a;,
        Lcom/transsion/player/orplayer/r$b;,
        Lcom/transsion/player/orplayer/r$c;
    }
.end annotation


# instance fields
.field private A:J

.field private B:J

.field private C:Z

.field private volatile D:Z

.field private E:Landroid/os/Handler;

.field private final F:Lcom/transsion/player/orplayer/r$f;

.field private G:Landroid/view/TextureView;

.field private H:Landroid/view/SurfaceView;

.field private final I:Lcom/transsion/player/orplayer/r$g;

.field private final a:Ljava/lang/String;

.field private b:Lcom/aliyun/player/AliPlayer;

.field private c:Lcom/transsion/player/orplayer/c;

.field private d:Lcom/transsion/player/orplayer/f;

.field private e:Lcom/transsion/player/orplayer/e;

.field private f:Ljava/lang/String;

.field private g:Lfo/e;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Ljava/lang/Double;

.field private n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private o:Landroid/content/Context;

.field private p:J

.field private q:I

.field private r:I

.field private s:J

.field private final t:J

.field private u:J

.field private v:J

.field private w:J

.field private x:J

.field private y:J

.field private final z:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgo/d;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ORPlayerImpl"

    iput-object v0, p0, Lcom/transsion/player/orplayer/r;->a:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/transsion/player/orplayer/r;->f:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    const-wide/32 v0, 0xc350

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->s:J

    const-wide/16 v0, 0x1f4

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->t:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->w:J

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->x:J

    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v2, p0, Lcom/transsion/player/orplayer/r;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->A:J

    new-instance v0, Lcom/transsion/player/orplayer/r$f;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/r$f;-><init>(Lcom/transsion/player/orplayer/r;)V

    iput-object v0, p0, Lcom/transsion/player/orplayer/r;->F:Lcom/transsion/player/orplayer/r$f;

    new-instance v0, Lcom/transsion/player/orplayer/r$g;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/r$g;-><init>(Lcom/transsion/player/orplayer/r;)V

    iput-object v0, p0, Lcom/transsion/player/orplayer/r;->I:Lcom/transsion/player/orplayer/r$g;

    iput-object p1, p0, Lcom/transsion/player/orplayer/r;->o:Landroid/content/Context;

    invoke-static {p1}, Lcom/aliyun/player/AliPlayerFactory;->createAliPlayer(Landroid/content/Context;)Lcom/aliyun/player/AliPlayer;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lgo/d;->o()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setTraceId(Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lgo/d;->e()Z

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    invoke-interface {p1, v1}, Lcom/aliyun/player/IPlayer;->enableHardwareDecoder(Z)V

    iput-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lgo/d;->i()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->A()V

    :goto_2
    if-nez p2, :cond_3

    sget-object p1, Lgo/b;->a:Lgo/b;

    invoke-virtual {p1}, Lgo/b;->a()Lgo/d;

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object p1, p2

    :goto_3
    invoke-virtual {p0, p1}, Lcom/transsion/player/orplayer/r;->setPlayerConfig(Lgo/d;)V

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lgo/d;->j()Z

    move-result v0

    :cond_4
    invoke-direct {p0, v0}, Lcom/transsion/player/orplayer/r;->C(Z)V

    return-void
.end method

.method private final A()V
    .locals 3

    new-instance v0, Lcom/transsion/player/orplayer/r$d;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/r$d;-><init>(Lcom/transsion/player/orplayer/r;)V

    new-instance v1, Lcom/transsion/player/orplayer/c;

    new-instance v2, Lcom/transsion/player/orplayer/h;

    invoke-direct {v2, p0}, Lcom/transsion/player/orplayer/h;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-direct {v1, v0, v2}, Lcom/transsion/player/orplayer/c;-><init>(Lcom/transsion/player/orplayer/d;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    return-void
.end method

.method private static final B(Lcom/transsion/player/orplayer/r;Z)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/transsion/player/orplayer/f;->onFocusChange(Z)V

    :cond_0
    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/player/orplayer/f;

    invoke-interface {v0, p1}, Lcom/transsion/player/orplayer/f;->onFocusChange(Z)V

    goto :goto_0

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private final C(Z)V
    .locals 2

    sget-object v0, Lgo/b;->a:Lgo/b;

    invoke-virtual {v0}, Lgo/b;->a()Lgo/d;

    move-result-object v1

    invoke-virtual {v0}, Lgo/b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, v1, p1}, Lcom/transsion/player/orplayer/r;->R(Lgo/d;Z)V

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/transsion/player/orplayer/i;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/i;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setOnRenderingStartListener(Lcom/aliyun/player/IPlayer$OnRenderingStartListener;)V

    :cond_1
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/transsion/player/orplayer/j;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/j;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setOnVideoSizeChangedListener(Lcom/aliyun/player/IPlayer$OnVideoSizeChangedListener;)V

    :cond_2
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_3

    new-instance v0, Lcom/transsion/player/orplayer/k;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/k;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setOnErrorListener(Lcom/aliyun/player/IPlayer$OnErrorListener;)V

    :cond_3
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_4

    new-instance v0, Lcom/transsion/player/orplayer/r$e;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/r$e;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setOnLoadingStatusListener(Lcom/aliyun/player/IPlayer$OnLoadingStatusListener;)V

    :cond_4
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_5

    new-instance v0, Lcom/transsion/player/orplayer/l;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/l;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setOnPreparedListener(Lcom/aliyun/player/IPlayer$OnPreparedListener;)V

    :cond_5
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_6

    new-instance v0, Lcom/transsion/player/orplayer/m;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/m;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setOnInfoListener(Lcom/aliyun/player/IPlayer$OnInfoListener;)V

    :cond_6
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_7

    new-instance v0, Lcom/transsion/player/orplayer/n;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/n;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setOnStateChangedListener(Lcom/aliyun/player/IPlayer$OnStateChangedListener;)V

    :cond_7
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_8

    new-instance v0, Lcom/transsion/player/orplayer/o;

    invoke-direct {v0, p0}, Lcom/transsion/player/orplayer/o;-><init>(Lcom/transsion/player/orplayer/r;)V

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setOnSeekCompleteListener(Lcom/aliyun/player/IPlayer$OnSeekCompleteListener;)V

    :cond_8
    return-void
.end method

.method private static final D(Lcom/transsion/player/orplayer/r;Lcom/aliyun/player/bean/ErrorInfo;)V
    .locals 4

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/aliyun/player/bean/ErrorInfo;->getCode()Lcom/aliyun/player/bean/ErrorCode;

    move-result-object v0

    invoke-virtual {p1}, Lcom/aliyun/player/bean/ErrorInfo;->getMsg()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onError code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ",msg:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Lcom/transsion/player/orplayer/PlayError;

    invoke-virtual {p1}, Lcom/aliyun/player/bean/ErrorInfo;->getCode()Lcom/aliyun/player/bean/ErrorCode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aliyun/player/bean/ErrorCode;->getValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/aliyun/player/bean/ErrorInfo;->getMsg()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/transsion/player/orplayer/PlayError;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/transsion/player/orplayer/r;->z(Lcom/transsion/player/orplayer/PlayError;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v1, v0, v2}, Lcom/transsion/player/orplayer/f;->onPlayError(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V

    :cond_2
    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/transsion/player/orplayer/f;

    iget-object v3, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v2, v0, v3}, Lcom/transsion/player/orplayer/f;->onPlayError(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lcom/aliyun/player/bean/ErrorInfo;->getCode()Lcom/aliyun/player/bean/ErrorCode;

    move-result-object p1

    sget-object v0, Lcom/aliyun/player/bean/ErrorCode;->ERROR_DECODE_AUDIO:Lcom/aliyun/player/bean/ErrorCode;

    if-ne p1, v0, :cond_4

    invoke-virtual {p0}, Lcom/transsion/player/orplayer/r;->prepare()V

    invoke-virtual {p0}, Lcom/transsion/player/orplayer/r;->play()V

    :cond_4
    return-void
.end method

.method private static final E(Lcom/transsion/player/orplayer/r;)V
    .locals 5

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->l:Z

    iget-boolean v1, p0, Lcom/transsion/player/orplayer/r;->C:Z

    if-eqz v1, :cond_1

    iget-wide v1, p0, Lcom/transsion/player/orplayer/r;->p:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    sget-object v1, Lro/e;->a:Lro/e;

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->a:Ljava/lang/String;

    const-string v3, "aliyun onPrepare \u5185\u90e8\u7684\u89e3\u7801\u5207\u6362\uff0c\u5df2\u6709\u64ad\u653e\u8fdb\u5ea6\uff0c\u76f4\u63a5\u64ad\u653e"

    invoke-virtual {v1, v2, v3, v0}, Lro/e;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-virtual {p0, v0, v1}, Lcom/transsion/player/orplayer/r;->seekTo(J)V

    invoke-virtual {p0}, Lcom/transsion/player/orplayer/r;->play()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v0, v1}, Lcom/transsion/player/orplayer/f;->onPrepare(Lfo/e;)V

    :cond_2
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/transsion/player/orplayer/f;

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v1, v2}, Lcom/transsion/player/orplayer/f;->onPrepare(Lfo/e;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private static final F(Lcom/transsion/player/orplayer/r;Lcom/aliyun/player/bean/InfoBean;)V
    .locals 5

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/aliyun/player/bean/InfoBean;->getExtraValue()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/aliyun/player/bean/InfoBean;->getCode()Lcom/aliyun/player/bean/InfoCode;

    move-result-object v2

    sget-object v3, Lcom/aliyun/player/bean/InfoCode;->CurrentPosition:Lcom/aliyun/player/bean/InfoCode;

    if-ne v2, v3, :cond_2

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->B:J

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->P()V

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v2, v0, v1, v3}, Lcom/transsion/player/orplayer/f;->onProgress(JLfo/e;)V

    :cond_1
    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/transsion/player/orplayer/f;

    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v3, v0, v1, v4}, Lcom/transsion/player/orplayer/f;->onProgress(JLfo/e;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/aliyun/player/bean/InfoBean;->getCode()Lcom/aliyun/player/bean/InfoCode;

    move-result-object v2

    sget-object v3, Lcom/aliyun/player/bean/InfoCode;->LoopingStart:Lcom/aliyun/player/bean/InfoCode;

    if-ne v2, v3, :cond_4

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v2, :cond_3

    invoke-interface {v2}, Lcom/transsion/player/orplayer/f;->onLoopingStart()V

    :cond_3
    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/transsion/player/orplayer/f;

    invoke-interface {v3}, Lcom/transsion/player/orplayer/f;->onLoopingStart()V

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/aliyun/player/bean/InfoBean;->getCode()Lcom/aliyun/player/bean/InfoCode;

    move-result-object v2

    sget-object v3, Lcom/aliyun/player/bean/InfoCode;->BufferedPosition:Lcom/aliyun/player/bean/InfoCode;

    if-ne v2, v3, :cond_6

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->u:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/transsion/player/orplayer/r;->v:J

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v2, :cond_5

    iget-object v3, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v2, v0, v1, v3}, Lcom/transsion/player/orplayer/f;->onBufferedPosition(JLfo/e;)V

    :cond_5
    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/transsion/player/orplayer/f;

    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v3, v0, v1, v4}, Lcom/transsion/player/orplayer/f;->onBufferedPosition(JLfo/e;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lcom/aliyun/player/bean/InfoBean;->getCode()Lcom/aliyun/player/bean/InfoCode;

    move-result-object p1

    sget-object v0, Lcom/aliyun/player/bean/InfoCode;->SwitchToSoftwareVideoDecoder:Lcom/aliyun/player/bean/InfoCode;

    if-ne p1, v0, :cond_7

    sget-object p1, Lro/e;->a:Lro/e;

    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->a:Ljava/lang/String;

    const-string v0, "aliyun \u786c\u89e3\u5931\u8d25\uff0c\u81ea\u52a8\u5207\u6362\u5230\u8f6f\u4ef6"

    const/4 v1, 0x1

    invoke-virtual {p1, p0, v0, v1}, Lro/e;->e(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_7
    return-void
.end method

.method private static final G(Lcom/transsion/player/orplayer/r;I)V
    .locals 6

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setOnStateChangedListener status:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-ne p1, v2, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v0

    :goto_0
    iput-boolean v3, p0, Lcom/transsion/player/orplayer/r;->h:Z

    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v4, :cond_2

    invoke-interface {v4, v3}, Lcom/transsion/player/orplayer/f;->onIsPlayingChanged(Z)V

    :cond_2
    iget-object v3, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/transsion/player/orplayer/f;

    iget-boolean v5, p0, Lcom/transsion/player/orplayer/r;->h:Z

    invoke-interface {v4, v5}, Lcom/transsion/player/orplayer/f;->onIsPlayingChanged(Z)V

    goto :goto_1

    :cond_3
    const/4 v3, 0x6

    if-ne p1, v3, :cond_4

    move v0, v1

    :cond_4
    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->k:Z

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_5

    iget-boolean v1, p0, Lcom/transsion/player/orplayer/r;->h:Z

    invoke-virtual {v0, v1}, Lcom/transsion/player/orplayer/c;->f(Z)V

    :cond_5
    if-eq p1, v2, :cond_c

    const/4 v0, 0x4

    if-eq p1, v0, :cond_a

    const/4 v0, 0x5

    if-eq p1, v0, :cond_9

    if-eq p1, v3, :cond_7

    const/4 v0, 0x7

    if-eq p1, v0, :cond_6

    goto/16 :goto_5

    :cond_6
    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-direct {p0, v0, v1}, Lcom/transsion/player/orplayer/r;->w(J)V

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->P()V

    goto/16 :goto_5

    :cond_7
    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-direct {p0, v0, v1}, Lcom/transsion/player/orplayer/r;->w(J)V

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->P()V

    const-string p1, "completion"

    invoke-direct {p0, p1}, Lcom/transsion/player/orplayer/r;->L(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz p1, :cond_8

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {p1, v0}, Lcom/transsion/player/orplayer/f;->onCompletion(Lfo/e;)V

    :cond_8
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/player/orplayer/f;

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v0, v1}, Lcom/transsion/player/orplayer/f;->onCompletion(Lfo/e;)V

    goto :goto_2

    :cond_9
    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-direct {p0, v0, v1}, Lcom/transsion/player/orplayer/r;->w(J)V

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->P()V

    const-string p1, "stopped"

    invoke-direct {p0, p1}, Lcom/transsion/player/orplayer/r;->L(Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-direct {p0, v0, v1}, Lcom/transsion/player/orplayer/r;->w(J)V

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->P()V

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz p1, :cond_b

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {p1, v0}, Lcom/transsion/player/orplayer/f;->onVideoPause(Lfo/e;)V

    :cond_b
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/player/orplayer/f;

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v0, v1}, Lcom/transsion/player/orplayer/f;->onVideoPause(Lfo/e;)V

    goto :goto_3

    :cond_c
    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-direct {p0, v0, v1}, Lcom/transsion/player/orplayer/r;->T(J)V

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz p1, :cond_d

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {p1, v0}, Lcom/transsion/player/orplayer/f;->onVideoStart(Lfo/e;)V

    :cond_d
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/player/orplayer/f;

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v0, v1}, Lcom/transsion/player/orplayer/f;->onVideoStart(Lfo/e;)V

    goto :goto_4

    :cond_e
    :goto_5
    return-void
.end method

.method private static final H(Lcom/transsion/player/orplayer/r;)V
    .locals 1

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/transsion/player/orplayer/f;->setOnSeekCompleteListener()V

    :cond_1
    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/player/orplayer/f;

    invoke-interface {v0}, Lcom/transsion/player/orplayer/f;->setOnSeekCompleteListener()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static final I(Lcom/transsion/player/orplayer/r;)V
    .locals 7

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->getMediaInfo()Lcom/aliyun/player/nativeclass/MediaInfo;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/aliyun/player/nativeclass/MediaInfo;->getTrackInfos()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aliyun/player/nativeclass/TrackInfo;

    sget-object v2, Lro/e;->a:Lro/e;

    iget-object v3, p0, Lcom/transsion/player/orplayer/r;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/blankj/utilcode/util/o;->j(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "setOnInfoListener onRenderFirstFrame "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v2, v3, v4, v5}, Lro/e;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v2, v1, Lcom/aliyun/player/nativeclass/TrackInfo;->mType:Lcom/aliyun/player/nativeclass/TrackInfo$Type;

    if-nez v2, :cond_2

    const/4 v2, -0x1

    goto :goto_1

    :cond_2
    sget-object v3, Lcom/transsion/player/orplayer/r$c;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_1
    if-eq v2, v5, :cond_5

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    goto :goto_0

    :cond_3
    iget v1, v1, Lcom/aliyun/player/nativeclass/TrackInfo;->videoBitrate:I

    iput v1, p0, Lcom/transsion/player/orplayer/r;->r:I

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v2, :cond_4

    invoke-interface {v2, v1}, Lcom/transsion/player/orplayer/f;->onTracksAudioBitrateChange(I)V

    :cond_4
    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/transsion/player/orplayer/f;

    iget v3, p0, Lcom/transsion/player/orplayer/r;->r:I

    invoke-interface {v2, v3}, Lcom/transsion/player/orplayer/f;->onTracksAudioBitrateChange(I)V

    goto :goto_2

    :cond_5
    iget v1, v1, Lcom/aliyun/player/nativeclass/TrackInfo;->videoBitrate:I

    iput v1, p0, Lcom/transsion/player/orplayer/r;->q:I

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v2, :cond_6

    invoke-interface {v2, v1}, Lcom/transsion/player/orplayer/f;->onTracksVideoBitrateChange(I)V

    :cond_6
    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/transsion/player/orplayer/f;

    iget v3, p0, Lcom/transsion/player/orplayer/r;->q:I

    invoke-interface {v2, v3}, Lcom/transsion/player/orplayer/f;->onTracksVideoBitrateChange(I)V

    goto :goto_3

    :cond_7
    iget v0, p0, Lcom/transsion/player/orplayer/r;->q:I

    iget v1, p0, Lcom/transsion/player/orplayer/r;->r:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setOnInfoListener onRenderFirstFrame\uff0cvideoBitrate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", audioBitrate:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v0, :cond_8

    invoke-interface {v0}, Lcom/transsion/player/orplayer/f;->onRenderFirstFrame()V

    :cond_8
    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/player/orplayer/f;

    invoke-interface {v0}, Lcom/transsion/player/orplayer/f;->onRenderFirstFrame()V

    goto :goto_4

    :cond_9
    return-void
.end method

.method private static final J(Lcom/transsion/player/orplayer/r;II)V
    .locals 1

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/transsion/player/orplayer/f;->onVideoSizeChanged(II)V

    :cond_1
    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/player/orplayer/f;

    invoke-interface {v0, p1, p2}, Lcom/transsion/player/orplayer/f;->onVideoSizeChanged(II)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final K()V
    .locals 20

    move-object/from16 v0, p0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, v0, Lcom/transsion/player/orplayer/r;->p:J

    const-wide/16 v5, 0x0

    invoke-static {v3, v4, v5, v6}, Lkotlin/ranges/RangesKt;->f(JJ)J

    move-result-wide v3

    iget-wide v7, v0, Lcom/transsion/player/orplayer/r;->v:J

    sub-long/2addr v1, v7

    const-wide/16 v7, 0x7d0

    cmp-long v1, v1, v7

    const/4 v2, 0x0

    const/4 v7, 0x1

    if-gtz v1, :cond_0

    move v1, v7

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    iget-wide v8, v0, Lcom/transsion/player/orplayer/r;->u:J

    invoke-static {v8, v9, v3, v4}, Lkotlin/ranges/RangesKt;->f(JJ)J

    move-result-wide v8

    goto :goto_1

    :cond_1
    move-wide v8, v3

    :goto_1
    sub-long v10, v8, v3

    invoke-static {v10, v11, v5, v6}, Lkotlin/ranges/RangesKt;->f(JJ)J

    move-result-wide v5

    long-to-double v10, v5

    const-wide/high16 v12, 0x4059000000000000L    # 100.0

    mul-double/2addr v10, v12

    iget-wide v12, v0, Lcom/transsion/player/orplayer/r;->s:J

    long-to-double v12, v12

    div-double v14, v10, v12

    const-wide/16 v16, 0x0

    const-wide/high16 v18, 0x4059000000000000L    # 100.0

    invoke-static/range {v14 .. v19}, Lkotlin/ranges/RangesKt;->j(DDD)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    iput-object v12, v0, Lcom/transsion/player/orplayer/r;->m:Ljava/lang/Double;

    iget-wide v12, v0, Lcom/transsion/player/orplayer/r;->s:J

    iget-wide v14, v0, Lcom/transsion/player/orplayer/r;->t:J

    sub-long/2addr v12, v14

    cmp-long v12, v5, v12

    if-ltz v12, :cond_2

    move v12, v7

    goto :goto_2

    :cond_2
    move v12, v2

    :goto_2
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    new-array v11, v7, [Ljava/lang/Object;

    aput-object v10, v11, v2

    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v7, "%.1f"

    invoke-static {v7, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "format(...)"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "aliyun-buffer-pool scene=release, current="

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", bufferedPosition="

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", bufferedMs="

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, ", poolPercent="

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", isPoolFull="

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", bufferedFresh="

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final L(Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/transsion/player/orplayer/r;->x()Lcom/transsion/player/orplayer/r$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/transsion/player/orplayer/r$a;->c()Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    sget-object v4, Lkotlin/jvm/internal/StringCompanionObject;->a:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "%.4f"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "format(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->g(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "null"

    :goto_0
    invoke-virtual {v1}, Lcom/transsion/player/orplayer/r$a;->b()J

    move-result-wide v2

    invoke-virtual {v1}, Lcom/transsion/player/orplayer/r$a;->a()J

    move-result-wide v4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "aliyun-bw scene="

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", downloadBytes="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", consumedEstimated="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", redundancyRate="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final M()V
    .locals 5

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->w:J

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->x:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/transsion/player/orplayer/r;->y:J

    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->A:J

    iput-wide v2, p0, Lcom/transsion/player/orplayer/r;->B:J

    return-void
.end method

.method private final N(Lkotlin/jvm/functions/Function0;)V
    .locals 3

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->E:Landroid/os/Handler;

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/transsion/player/orplayer/q;

    invoke-direct {v1, p1}, Lcom/transsion/player/orplayer/q;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :goto_1
    return-void
.end method

.method private static final O(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final P()V
    .locals 6

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-static {v0}, Landroid/net/TrafficStats;->getUidRxBytes(I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    const-wide/16 v4, -0x1

    cmp-long v4, v0, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v4, p0, Lcom/transsion/player/orplayer/r;->w:J

    cmp-long v4, v4, v2

    if-gez v4, :cond_1

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->w:J

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->x:J

    return-void

    :cond_1
    iget-wide v4, p0, Lcom/transsion/player/orplayer/r;->x:J

    cmp-long v2, v4, v2

    if-ltz v2, :cond_2

    cmp-long v2, v0, v4

    if-ltz v2, :cond_2

    iget-wide v2, p0, Lcom/transsion/player/orplayer/r;->y:J

    sub-long v4, v0, v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/transsion/player/orplayer/r;->y:J

    :cond_2
    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->x:J

    :cond_3
    :goto_0
    return-void
.end method

.method private final R(Lgo/d;Z)V
    .locals 4

    new-instance v0, Lcom/aliyun/player/nativeclass/CacheConfig;

    invoke-direct {v0}, Lcom/aliyun/player/nativeclass/CacheConfig;-><init>()V

    iput-boolean p2, v0, Lcom/aliyun/player/nativeclass/CacheConfig;->mEnable:Z

    const-wide/16 v1, 0x78

    iput-wide v1, v0, Lcom/aliyun/player/nativeclass/CacheConfig;->mMaxDurationS:J

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->o:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "video_cache"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/aliyun/player/nativeclass/CacheConfig;->mDir:Ljava/lang/String;

    invoke-virtual {p1}, Lgo/d;->a()I

    move-result p1

    iput p1, v0, Lcom/aliyun/player/nativeclass/CacheConfig;->mMaxSizeMB:I

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setCacheConfig(Lcom/aliyun/player/nativeclass/CacheConfig;)V

    :cond_1
    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    const/4 p1, 0x0

    invoke-static {p2, p1, v1}, Lcom/aliyun/player/AliPlayerGlobalSettings;->enableLocalCache(ZILjava/lang/String;)V

    new-instance p1, Lcom/transsion/player/orplayer/p;

    invoke-direct {p1}, Lcom/transsion/player/orplayer/p;-><init>()V

    invoke-static {p1}, Lcom/aliyun/player/AliPlayerGlobalSettings;->setCacheUrlHashCallback(Lcom/aliyun/player/AliPlayerGlobalSettings$OnGetUrlHashCallback;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method

.method private static final S(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    sget-object v1, Lro/d;->a:Lro/d$a;

    new-instance v8, Ljava/net/URI;

    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/net/URI;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    move-result-object v7

    const/4 v6, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lro/d$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lro/d;->a:Lro/d$a;

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-virtual {v0, p0}, Lro/d$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private final T(J)V
    .locals 4

    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->A:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    invoke-static {p1, p2, v2, v3}, Lkotlin/ranges/RangesKt;->f(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/transsion/player/orplayer/r;->A:J

    :cond_0
    return-void
.end method

.method private final U()J
    .locals 10

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    move-wide v3, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/transsion/player/orplayer/r$b;

    invoke-virtual {v5}, Lcom/transsion/player/orplayer/r$b;->a()J

    move-result-wide v6

    invoke-virtual {v5}, Lcom/transsion/player/orplayer/r$b;->b()J

    move-result-wide v8

    sub-long/2addr v6, v8

    invoke-static {v6, v7, v1, v2}, Lkotlin/ranges/RangesKt;->f(JJ)J

    move-result-wide v5

    add-long/2addr v3, v5

    goto :goto_0

    :cond_0
    iget-wide v5, p0, Lcom/transsion/player/orplayer/r;->A:J

    cmp-long v0, v5, v1

    if-ltz v0, :cond_1

    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->B:J

    cmp-long v2, v0, v5

    if-lez v2, :cond_1

    sub-long/2addr v0, v5

    add-long/2addr v3, v0

    :cond_1
    return-wide v3
.end method

.method public static synthetic c(Lcom/transsion/player/orplayer/r;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/transsion/player/orplayer/r;->B(Lcom/transsion/player/orplayer/r;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0}, Lcom/transsion/player/orplayer/r;->O(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic e(Lcom/transsion/player/orplayer/r;)V
    .locals 0

    invoke-static {p0}, Lcom/transsion/player/orplayer/r;->E(Lcom/transsion/player/orplayer/r;)V

    return-void
.end method

.method public static synthetic f(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/transsion/player/orplayer/r;->S(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/transsion/player/orplayer/r;II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/transsion/player/orplayer/r;->J(Lcom/transsion/player/orplayer/r;II)V

    return-void
.end method

.method public static synthetic h(Lcom/transsion/player/orplayer/r;Lcom/aliyun/player/bean/ErrorInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/transsion/player/orplayer/r;->D(Lcom/transsion/player/orplayer/r;Lcom/aliyun/player/bean/ErrorInfo;)V

    return-void
.end method

.method public static synthetic i(Lcom/transsion/player/orplayer/r;)V
    .locals 0

    invoke-static {p0}, Lcom/transsion/player/orplayer/r;->H(Lcom/transsion/player/orplayer/r;)V

    return-void
.end method

.method public static synthetic j(Lcom/transsion/player/orplayer/r;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/transsion/player/orplayer/r;->G(Lcom/transsion/player/orplayer/r;I)V

    return-void
.end method

.method public static synthetic k(Lcom/transsion/player/orplayer/r;)V
    .locals 0

    invoke-static {p0}, Lcom/transsion/player/orplayer/r;->I(Lcom/transsion/player/orplayer/r;)V

    return-void
.end method

.method public static synthetic l(Lcom/transsion/player/orplayer/r;Lcom/aliyun/player/bean/InfoBean;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/transsion/player/orplayer/r;->F(Lcom/transsion/player/orplayer/r;Lcom/aliyun/player/bean/InfoBean;)V

    return-void
.end method

.method public static final synthetic m(Lcom/transsion/player/orplayer/r;)Lcom/aliyun/player/AliPlayer;
    .locals 0

    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    return-object p0
.end method

.method public static final synthetic n(Lcom/transsion/player/orplayer/r;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->E:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic o(Lcom/transsion/player/orplayer/r;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method public static final synthetic p(Lcom/transsion/player/orplayer/r;)Lfo/e;
    .locals 0

    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    return-object p0
.end method

.method public static final synthetic q(Lcom/transsion/player/orplayer/r;)Lcom/transsion/player/orplayer/f;
    .locals 0

    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    return-object p0
.end method

.method public static final synthetic r(Lcom/transsion/player/orplayer/r;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/transsion/player/orplayer/r;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic s(Lcom/transsion/player/orplayer/r;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    return p0
.end method

.method public static final synthetic t(Lcom/transsion/player/orplayer/r;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/transsion/player/orplayer/r;->N(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final synthetic u(Lcom/transsion/player/orplayer/r;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/transsion/player/orplayer/r;->i:Z

    return-void
.end method

.method private final v()V
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->H:Landroid/view/SurfaceView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->F:Lcom/transsion/player/orplayer/r$f;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/transsion/player/orplayer/r;->H:Landroid/view/SurfaceView;

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->G:Landroid/view/TextureView;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :cond_1
    iput-object v0, p0, Lcom/transsion/player/orplayer/r;->G:Landroid/view/TextureView;

    return-void
.end method

.method private final w(J)V
    .locals 4

    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->A:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2, v0, v1}, Lkotlin/ranges/RangesKt;->f(JJ)J

    move-result-wide p1

    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->A:J

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v3, Lcom/transsion/player/orplayer/r$b;

    invoke-direct {v3, v0, v1, p1, p2}, Lcom/transsion/player/orplayer/r$b;-><init>(JJ)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/transsion/player/orplayer/r;->A:J

    return-void
.end method

.method private final y()J
    .locals 3

    iget v0, p0, Lcom/transsion/player/orplayer/r;->q:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->e(II)I

    move-result v0

    iget v2, p0, Lcom/transsion/player/orplayer/r;->r:I

    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    if-lez v0, :cond_0

    int-to-long v0, v0

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0xc3500

    :goto_0
    return-wide v0
.end method

.method private final z(Lcom/transsion/player/orplayer/PlayError;)Z
    .locals 4

    invoke-virtual {p1}, Lcom/transsion/player/orplayer/PlayError;->getErrorCode()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v2, 0x20040001

    if-eq v0, v2, :cond_2

    :goto_0
    invoke-virtual {p1}, Lcom/transsion/player/orplayer/PlayError;->getErrorCode()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const v0, 0x20040002

    if-eq p1, v0, :cond_2

    :goto_1
    return v1

    :cond_2
    iget-boolean p1, p0, Lcom/transsion/player/orplayer/r;->C:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    sget-object p1, Lro/e;->a:Lro/e;

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->a:Ljava/lang/String;

    const-string v3, "aliyun \u5df2\u7ecf\u5207\u8fc7\u8f6f\u89e3\uff0c\u8fd8\u662f\u51fa\u9519\u4e0d\u518d\u5904\u7406"

    invoke-virtual {p1, v2, v3, v0}, Lro/e;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    return v1

    :cond_3
    sget-object p1, Lro/e;->a:Lro/e;

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->a:Ljava/lang/String;

    const-string v3, "aliyun onError -- \u89e3\u7801\u5931\u8d25\uff0c\u5f3a\u5236\u5207\u5230\u8f6f\u89e3"

    invoke-virtual {p1, v2, v3, v0}, Lro/e;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz p1, :cond_4

    iget-object v2, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {p1, v2}, Lcom/transsion/player/orplayer/f;->onAliyunDecodeErrorChangeSoftwareDecoder(Lfo/e;)V

    :cond_4
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/transsion/player/orplayer/f;

    iget-object v3, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-interface {v2, v3}, Lcom/transsion/player/orplayer/f;->onAliyunDecodeErrorChangeSoftwareDecoder(Lfo/e;)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/transsion/player/orplayer/r;->stop()V

    invoke-virtual {p0}, Lcom/transsion/player/orplayer/r;->reset()V

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_6

    invoke-interface {p1, v1}, Lcom/aliyun/player/IPlayer;->enableHardwareDecoder(Z)V

    :cond_6
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    if-eqz p1, :cond_7

    invoke-virtual {p0, p1}, Lcom/transsion/player/orplayer/r;->setDataSource(Lfo/e;)V

    invoke-virtual {p0}, Lcom/transsion/player/orplayer/r;->prepare()V

    :cond_7
    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->C:Z

    return v0
.end method


# virtual methods
.method public final Q(Lcom/transsion/player/orplayer/e;)V
    .locals 0

    iput-object p1, p0, Lcom/transsion/player/orplayer/r;->e:Lcom/transsion/player/orplayer/e;

    return-void
.end method

.method public addDataSource(Lfo/e;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/transsion/player/orplayer/g$b;->a(Lcom/transsion/player/orplayer/g;Lfo/e;)Z

    move-result p1

    return p1
.end method

.method public addPlayerListener(Lcom/transsion/player/orplayer/f;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public changeTrackSelection(Lpo/d;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/transsion/player/orplayer/g$b;->c(Lcom/transsion/player/orplayer/g;Lpo/d;I)V

    return-void
.end method

.method public clearScreen()V
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->clearScreen()V

    :cond_0
    return-void
.end method

.method public clearSurfaceOnly()V
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/aliyun/player/IPlayer;->setSurface(Landroid/view/Surface;)V

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->H:Landroid/view/SurfaceView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_1
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->G:Landroid/view/TextureView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_2
    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->v()V

    return-void
.end method

.method public currentMediaSource()Lfo/e;
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    return-object v0
.end method

.method public enableHardwareDecoder(Z)V
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aliyun/player/IPlayer;->enableHardwareDecoder(Z)V

    :cond_0
    return-void
.end method

.method public getBitrate()Lkotlin/Pair;
    .locals 3

    new-instance v0, Lkotlin/Pair;

    iget v1, p0, Lcom/transsion/player/orplayer/r;->q:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lcom/transsion/player/orplayer/r;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public getCurrentPosition()J
    .locals 2

    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    return-wide v0
.end method

.method public getCurrentTracks()Lpo/c;
    .locals 1

    invoke-static {p0}, Lcom/transsion/player/orplayer/g$b;->h(Lcom/transsion/player/orplayer/g;)Lpo/c;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentVideoFormat()Lpo/b;
    .locals 1

    invoke-static {p0}, Lcom/transsion/player/orplayer/g$b;->i(Lcom/transsion/player/orplayer/g;)Lpo/b;

    move-result-object v0

    return-object v0
.end method

.method public getDownloadBitrate()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/aliyun/player/IPlayer$Option;->DownloadBitrate:Lcom/aliyun/player/IPlayer$Option;

    invoke-interface {v0, v1}, Lcom/aliyun/player/IPlayer;->getOption(Lcom/aliyun/player/IPlayer$Option;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getDuration()J
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->getDuration()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public getVideoHeight()I
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->getVideoHeight()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/transsion/player/orplayer/g$b;->k(Lcom/transsion/player/orplayer/g;)I

    move-result v0

    :goto_0
    return v0
.end method

.method public getVideoWidth()I
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->getVideoWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/transsion/player/orplayer/g$b;->l(Lcom/transsion/player/orplayer/g;)I

    move-result v0

    :goto_0
    return v0
.end method

.method public getVolume()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->getVolume()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public isComplete()Z
    .locals 1

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->k:Z

    return v0
.end method

.method public isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->i:Z

    return v0
.end method

.method public isMute()Z
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->isMute()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPlaying()Z
    .locals 1

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->h:Z

    return v0
.end method

.method public isPrepared()Z
    .locals 1

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->l:Z

    return v0
.end method

.method public pause()V
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/transsion/player/orplayer/c;->g(Z)V

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->pause()V

    :cond_1
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/transsion/player/orplayer/c;->b()V

    :cond_2
    return-void
.end method

.method public play()V
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/transsion/player/orplayer/f;->initPlayer()V

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/transsion/player/orplayer/f;

    invoke-interface {v1}, Lcom/transsion/player/orplayer/f;->initPlayer()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->start()V

    :cond_2
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/transsion/player/orplayer/c;->g(Z)V

    :cond_3
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/transsion/player/orplayer/c;->e()V

    :cond_4
    return-void
.end method

.method public prepare()V
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->prepare()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->j:Z

    return-void
.end method

.method public release()V
    .locals 12

    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->D:Z

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iget-wide v4, p0, Lcom/transsion/player/orplayer/r;->B:J

    iget-wide v6, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-static {v4, v5, v6, v7}, Lkotlin/ranges/RangesKt;->f(JJ)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/transsion/player/orplayer/r;->p:J

    iput-wide v4, p0, Lcom/transsion/player/orplayer/r;->B:J

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->K()V

    invoke-virtual {p0}, Lcom/transsion/player/orplayer/r;->x()Lcom/transsion/player/orplayer/r$a;

    move-result-object v4

    iget-object v5, p0, Lcom/transsion/player/orplayer/r;->e:Lcom/transsion/player/orplayer/e;

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lcom/transsion/player/orplayer/r$a;->c()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v4}, Lcom/transsion/player/orplayer/r$a;->b()J

    move-result-wide v7

    invoke-virtual {v4}, Lcom/transsion/player/orplayer/r$a;->a()J

    move-result-wide v9

    iget-object v11, p0, Lcom/transsion/player/orplayer/r;->m:Ljava/lang/Double;

    invoke-interface/range {v5 .. v11}, Lcom/transsion/player/orplayer/e;->a(Ljava/lang/Double;JJLjava/lang/Double;)V

    :cond_1
    const-string v4, ""

    iput-object v4, p0, Lcom/transsion/player/orplayer/r;->f:Ljava/lang/String;

    iget-wide v4, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-direct {p0, v4, v5}, Lcom/transsion/player/orplayer/r;->w(J)V

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->P()V

    const-string v4, "release"

    invoke-direct {p0, v4}, Lcom/transsion/player/orplayer/r;->L(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_2

    invoke-interface {v4, v3}, Lcom/aliyun/player/IPlayer;->setOnRenderingStartListener(Lcom/aliyun/player/IPlayer$OnRenderingStartListener;)V

    :cond_2
    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_3

    invoke-interface {v4, v3}, Lcom/aliyun/player/IPlayer;->setOnVideoSizeChangedListener(Lcom/aliyun/player/IPlayer$OnVideoSizeChangedListener;)V

    :cond_3
    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_4

    invoke-interface {v4, v3}, Lcom/aliyun/player/IPlayer;->setOnErrorListener(Lcom/aliyun/player/IPlayer$OnErrorListener;)V

    :cond_4
    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_5

    invoke-interface {v4, v3}, Lcom/aliyun/player/IPlayer;->setOnLoadingStatusListener(Lcom/aliyun/player/IPlayer$OnLoadingStatusListener;)V

    :cond_5
    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_6

    invoke-interface {v4, v3}, Lcom/aliyun/player/IPlayer;->setOnPreparedListener(Lcom/aliyun/player/IPlayer$OnPreparedListener;)V

    :cond_6
    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_7

    invoke-interface {v4, v3}, Lcom/aliyun/player/IPlayer;->setOnInfoListener(Lcom/aliyun/player/IPlayer$OnInfoListener;)V

    :cond_7
    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_8

    invoke-interface {v4, v3}, Lcom/aliyun/player/IPlayer;->setOnStateChangedListener(Lcom/aliyun/player/IPlayer$OnStateChangedListener;)V

    :cond_8
    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_9

    invoke-interface {v4, v3}, Lcom/aliyun/player/IPlayer;->setOnSeekCompleteListener(Lcom/aliyun/player/IPlayer$OnSeekCompleteListener;)V

    :cond_9
    iget-object v4, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v4, :cond_a

    invoke-interface {v4}, Lcom/aliyun/player/IPlayer;->release()V

    :cond_a
    iput-object v3, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v1, :cond_b

    invoke-static {v1, v3, v0, v3}, Lcom/transsion/player/orplayer/f$a;->u(Lcom/transsion/player/orplayer/f;Lfo/e;ILjava/lang/Object;)V

    :cond_b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/transsion/player/orplayer/f;

    invoke-static {v2, v3, v0, v3}, Lcom/transsion/player/orplayer/f$a;->u(Lcom/transsion/player/orplayer/f;Lfo/e;ILjava/lang/Object;)V

    goto :goto_0

    :cond_c
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/transsion/player/orplayer/c;->b()V

    :cond_d
    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->v()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->l:Z

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->C:Z

    return-void
.end method

.method public release(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/transsion/player/orplayer/g$b;->o(Lcom/transsion/player/orplayer/g;Ljava/lang/String;)V

    return-void
.end method

.method public removeDataSource(Lfo/e;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/transsion/player/orplayer/g$b;->p(Lcom/transsion/player/orplayer/g;Lfo/e;)Z

    move-result p1

    return p1
.end method

.method public removePlayerListener(Lcom/transsion/player/orplayer/f;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public requestForce()Z
    .locals 1

    invoke-static {p0}, Lcom/transsion/player/orplayer/g$b;->r(Lcom/transsion/player/orplayer/g;)Z

    move-result v0

    return v0
.end method

.method public reset()V
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->stop()V

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->reset()V

    :cond_1
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->clearScreen()V

    :cond_2
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/transsion/player/orplayer/c;->b()V

    :cond_3
    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->j:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/transsion/player/orplayer/f;->onPlayerReset()V

    :cond_4
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/transsion/player/orplayer/f;

    invoke-interface {v1}, Lcom/transsion/player/orplayer/f;->onPlayerReset()V

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->j:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->l:Z

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->C:Z

    return-void
.end method

.method public seekTo(J)V
    .locals 2

    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->p:J

    invoke-direct {p0, v0, v1}, Lcom/transsion/player/orplayer/r;->w(J)V

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    const v1, 0x249f0

    invoke-interface {v0, v1}, Lcom/aliyun/player/IPlayer;->setMaxAccurateSeekDelta(I)V

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/aliyun/player/IPlayer$SeekMode;->Accurate:Lcom/aliyun/player/IPlayer$SeekMode;

    invoke-interface {v0, p1, p2, v1}, Lcom/aliyun/player/IPlayer;->seekTo(JLcom/aliyun/player/IPlayer$SeekMode;)V

    :cond_1
    iget-boolean v0, p0, Lcom/transsion/player/orplayer/r;->h:Z

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2}, Lcom/transsion/player/orplayer/r;->T(J)V

    :cond_2
    return-void
.end method

.method public seekTo(Ljava/lang/String;J)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/transsion/player/orplayer/g$b;->s(Lcom/transsion/player/orplayer/g;Ljava/lang/String;J)V

    return-void
.end method

.method public setAutoPlay(Z)V
    .locals 0

    return-void
.end method

.method public setDataSource(Lfo/e;)V
    .locals 2

    const-string v0, "mediaSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->M()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->u:J

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->v:J

    new-instance v0, Lcom/aliyun/player/source/UrlSource;

    invoke-direct {v0}, Lcom/aliyun/player/source/UrlSource;-><init>()V

    invoke-virtual {p1}, Lfo/e;->k()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/transsion/player/orplayer/r;->f:Ljava/lang/String;

    iput-object p1, p0, Lcom/transsion/player/orplayer/r;->g:Lfo/e;

    invoke-virtual {v0, v1}, Lcom/aliyun/player/source/UrlSource;->setUri(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/transsion/player/orplayer/f;->onSetDataSource()V

    :cond_0
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/transsion/player/orplayer/f;

    invoke-interface {v1}, Lcom/transsion/player/orplayer/f;->onSetDataSource()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lcom/aliyun/player/UrlPlayer;->setDataSource(Lcom/aliyun/player/source/UrlSource;)V

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/transsion/player/orplayer/r;->l:Z

    iput-boolean p1, p0, Lcom/transsion/player/orplayer/r;->C:Z

    return-void
.end method

.method public setLooping(Z)V
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aliyun/player/IPlayer;->setLoop(Z)V

    :cond_0
    return-void
.end method

.method public setMute(Z)V
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aliyun/player/IPlayer;->setMute(Z)V

    :cond_0
    return-void
.end method

.method public setPlayerConfig(Lgo/d;)V
    .locals 5

    const-string v0, "vodConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->getConfig()Lcom/aliyun/player/nativeclass/PlayerConfig;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "null cannot be cast to non-null type com.aliyun.player.nativeclass.PlayerConfig"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgo/d;->b()Z

    move-result v1

    iput-boolean v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mClearFrameWhenStop:Z

    invoke-virtual {p1}, Lgo/d;->j()Z

    move-result v1

    iput-boolean v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mEnableLocalCache:Z

    invoke-virtual {p1}, Lgo/d;->k()I

    move-result v1

    iput v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mPositionTimerIntervalMs:I

    invoke-virtual {p1}, Lgo/d;->g()I

    move-result v1

    iput v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mMaxBufferDuration:I

    invoke-virtual {p1}, Lgo/d;->f()I

    move-result v1

    iput v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mHighBufferDuration:I

    invoke-virtual {p1}, Lgo/d;->n()I

    move-result v1

    iput v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mStartBufferDuration:I

    invoke-virtual {p1}, Lgo/d;->m()I

    move-result v1

    iput v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mNetworkRetryCount:I

    invoke-virtual {p1}, Lgo/d;->h()I

    move-result v1

    iput v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mNetworkTimeout:I

    invoke-virtual {p1}, Lgo/d;->c()Z

    move-result v1

    iput-boolean v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mDisableAudio:Z

    invoke-virtual {p1}, Lgo/d;->d()Z

    move-result v1

    iput-boolean v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mDisableVideo:Z

    invoke-virtual {p1}, Lgo/d;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Aliplayer config:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-lez v1, :cond_1

    iput v1, v0, Lcom/aliyun/player/nativeclass/PlayerConfig;->mMaxBufferDuration:I

    :cond_1
    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Lcom/aliyun/player/IPlayer;->setConfig(Lcom/aliyun/player/nativeclass/PlayerConfig;)V

    :cond_2
    invoke-virtual {p1}, Lgo/d;->g()I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0x1

    invoke-static {v0, v1, v2, v3}, Lkotlin/ranges/RangesKt;->f(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/transsion/player/orplayer/r;->s:J

    return-void
.end method

.method public setPlayerListener(Lcom/transsion/player/orplayer/f;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/transsion/player/orplayer/r;->d:Lcom/transsion/player/orplayer/f;

    return-void
.end method

.method public setScaleMode(Lcom/transsion/player/enum/ScaleMode;)V
    .locals 1

    const-string v0, "scaleMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/transsion/player/orplayer/r$c;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_3

    sget-object v0, Lcom/aliyun/player/IPlayer$ScaleMode;->SCALE_ASPECT_FIT:Lcom/aliyun/player/IPlayer$ScaleMode;

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setScaleMode(Lcom/aliyun/player/IPlayer$ScaleMode;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_3

    sget-object v0, Lcom/aliyun/player/IPlayer$ScaleMode;->SCALE_TO_FILL:Lcom/aliyun/player/IPlayer$ScaleMode;

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setScaleMode(Lcom/aliyun/player/IPlayer$ScaleMode;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_3

    sget-object v0, Lcom/aliyun/player/IPlayer$ScaleMode;->SCALE_ASPECT_FILL:Lcom/aliyun/player/IPlayer$ScaleMode;

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setScaleMode(Lcom/aliyun/player/IPlayer$ScaleMode;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public setSpeed(F)V
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aliyun/player/IPlayer;->setSpeed(F)V

    :cond_0
    return-void
.end method

.method public setSurfaceView(Landroid/view/SurfaceView;)V
    .locals 2

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->v()V

    iput-object p1, p0, Lcom/transsion/player/orplayer/r;->H:Landroid/view/SurfaceView;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eqz p1, :cond_1

    instance-of v1, v0, Landroid/os/HandlerThread;

    if-eqz v1, :cond_0

    new-instance v1, Landroid/os/Handler;

    check-cast v0, Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    iput-object v1, p0, Lcom/transsion/player/orplayer/r;->E:Landroid/os/Handler;

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->F:Lcom/transsion/player/orplayer/r$f;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lcom/aliyun/player/IPlayer;->setSurface(Landroid/view/Surface;)V

    :cond_3
    return-void
.end method

.method public setTextureView(Landroid/view/TextureView;)V
    .locals 2

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->v()V

    iput-object p1, p0, Lcom/transsion/player/orplayer/r;->G:Landroid/view/TextureView;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lcom/transsion/player/orplayer/r;->H:Landroid/view/SurfaceView;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/os/HandlerThread;

    if-eqz v1, :cond_0

    new-instance v1, Landroid/os/Handler;

    check-cast v0, Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    iput-object v1, p0, Lcom/transsion/player/orplayer/r;->E:Landroid/os/Handler;

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->I:Lcom/transsion/player/orplayer/r$g;

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz p1, :cond_3

    invoke-interface {p1, v0}, Lcom/aliyun/player/IPlayer;->setSurface(Landroid/view/Surface;)V

    :cond_3
    return-void
.end method

.method public setVipResolution(ZI)V
    .locals 0

    return-void
.end method

.method public setVolume(F)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setVolume   volume:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {p1, v1, v2}, Lkotlin/ranges/RangesKt;->k(FFF)F

    move-result p1

    invoke-interface {v0, p1}, Lcom/aliyun/player/IPlayer;->setVolume(F)V

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 2

    const-string v0, ""

    iput-object v0, p0, Lcom/transsion/player/orplayer/r;->f:Ljava/lang/String;

    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/transsion/player/orplayer/c;->g(Z)V

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->b:Lcom/aliyun/player/AliPlayer;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/aliyun/player/IPlayer;->stop()V

    :cond_1
    iget-object v0, p0, Lcom/transsion/player/orplayer/r;->c:Lcom/transsion/player/orplayer/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/transsion/player/orplayer/c;->b()V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/transsion/player/orplayer/r;->C:Z

    return-void
.end method

.method public final x()Lcom/transsion/player/orplayer/r$a;
    .locals 8

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->U()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-direct {p0}, Lcom/transsion/player/orplayer/r;->y()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x4020000000000000L    # 8.0

    div-double/2addr v2, v4

    mul-double/2addr v0, v2

    double-to-long v5, v0

    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lcom/transsion/player/orplayer/r;->y:J

    sub-long v2, v0, v5

    long-to-double v2, v2

    long-to-double v0, v0

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmpg-double v1, v1, v3

    if-gez v1, :cond_1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    :cond_1
    move-object v7, v0

    new-instance v0, Lcom/transsion/player/orplayer/r$a;

    iget-wide v3, p0, Lcom/transsion/player/orplayer/r;->y:J

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/transsion/player/orplayer/r$a;-><init>(JJLjava/lang/Double;)V

    return-object v0
.end method
