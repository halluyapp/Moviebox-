.class public abstract Lcom/transsion/player/longvideo/helper/d;
.super Ljava/lang/Object;


# instance fields
.field private a:Llo/j;

.field private b:Ljava/lang/String;

.field private c:Ljo/a$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()Ljo/a$b;
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/longvideo/helper/d;->c:Ljo/a$b;

    return-object v0
.end method

.method protected final b()Llo/j;
    .locals 1

    iget-object v0, p0, Lcom/transsion/player/longvideo/helper/d;->a:Llo/j;

    return-object v0
.end method

.method public c(Ljava/lang/String;Llo/j;)V
    .locals 1

    const-string v0, "viewBinding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/transsion/player/longvideo/helper/d;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/transsion/player/longvideo/helper/d;->a:Llo/j;

    return-void
.end method

.method public final d(Ljo/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/transsion/player/longvideo/helper/d;->c:Ljo/a$b;

    return-void
.end method
