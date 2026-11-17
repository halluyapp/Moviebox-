.class public final Lcom/transsion/postdetail/shorttv_pugc/factory/f$a;
.super Ljava/lang/Object;

# interfaces
.implements Lux/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/transsion/postdetail/shorttv_pugc/factory/f;->g(Landroidx/fragment/app/FragmentActivity;Ltt/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lrx/a;)Z
    .locals 1

    sget-object v0, Lcom/transsion/postdetail/util/UGCShortTVFloatManager;->b:Lcom/transsion/postdetail/util/UGCShortTVFloatManager;

    invoke-virtual {v0, p1}, Lcom/transsion/postdetail/util/UGCShortTVFloatManager;->m(Lrx/a;)Z

    move-result p1

    return p1
.end method

.method public b(Lrx/a;)V
    .locals 1

    sget-object v0, Lcom/transsion/postdetail/util/UGCShortTVFloatManager;->b:Lcom/transsion/postdetail/util/UGCShortTVFloatManager;

    invoke-virtual {v0}, Lcom/transsion/postdetail/util/UGCShortTVFloatManager;->j()V

    invoke-virtual {v0, p1}, Lcom/transsion/postdetail/util/UGCShortTVFloatManager;->n(Lrx/a;)V

    return-void
.end method

.method public c(Lrx/a;)V
    .locals 1

    invoke-static {p0, p1}, Lux/a$a;->a(Lux/a;Lrx/a;)V

    sget-object v0, Lcom/transsion/postdetail/util/UGCShortTVFloatManager;->b:Lcom/transsion/postdetail/util/UGCShortTVFloatManager;

    invoke-virtual {v0, p1}, Lcom/transsion/postdetail/util/UGCShortTVFloatManager;->k(Lrx/a;)V

    return-void
.end method
