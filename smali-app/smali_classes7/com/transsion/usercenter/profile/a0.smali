.class public final synthetic Lcom/transsion/usercenter/profile/a0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Llw/j0;


# direct methods
.method public synthetic constructor <init>(Llw/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/transsion/usercenter/profile/a0;->a:Llw/j0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/profile/a0;->a:Llw/j0;

    invoke-static {v0}, Lcom/transsion/usercenter/profile/ProfileFragment;->k0(Llw/j0;)V

    return-void
.end method
