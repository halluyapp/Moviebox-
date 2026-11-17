.class public final Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;

.field private static b:Z

.field private static final c:Lkotlin/Lazy;

.field private static final d:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;

    invoke-direct {v0}, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;-><init>()V

    sput-object v0, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->a:Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;

    new-instance v0, Lcom/transsion/usercenter/setting/labelsfeedback/q;

    invoke-direct {v0}, Lcom/transsion/usercenter/setting/labelsfeedback/q;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->b(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->c:Lkotlin/Lazy;

    new-instance v0, Lcom/transsion/usercenter/setting/labelsfeedback/r;

    invoke-direct {v0}, Lcom/transsion/usercenter/setting/labelsfeedback/r;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->b(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->d:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lax/a;
    .locals 1

    invoke-static {}, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->i()Lax/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Lgz/a;
    .locals 1

    invoke-static {}, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->h()Lgz/a;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c(Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;)Lgz/a;
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->e()Lgz/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;)Lax/a;
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->f()Lax/a;

    move-result-object p0

    return-object p0
.end method

.method private final e()Lgz/a;
    .locals 1

    sget-object v0, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgz/a;

    return-object v0
.end method

.method private final f()Lax/a;
    .locals 1

    sget-object v0, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lax/a;

    return-object v0
.end method

.method private static final h()Lgz/a;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-class v1, Lgz/a;

    invoke-static {v1, v0}, Lcom/therouter/TheRouter;->d(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgz/a;

    return-object v0
.end method

.method private static final i()Lax/a;
    .locals 2

    sget-object v0, Ldh/c;->e:Ldh/c$a;

    invoke-virtual {v0}, Ldh/c$a;->a()Ldh/c;

    move-result-object v0

    const-class v1, Lax/a;

    invoke-virtual {v0, v1}, Ldh/c;->h(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lax/a;

    return-object v0
.end method


# virtual methods
.method public final g()V
    .locals 2

    sget-boolean v0, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit;->b:Z

    sget-object v0, Liw/c;->a:Liw/c;

    new-instance v1, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit$init$1;

    invoke-direct {v1}, Lcom/transsion/usercenter/setting/labelsfeedback/UploadInit$init$1;-><init>()V

    invoke-virtual {v0, v1}, Liw/c;->e(Liw/b;)V

    return-void
.end method
