.class public final synthetic Lcom/transsion/usercenter/me/adapter/v;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Landroid/widget/TextView;

.field public final synthetic c:Lcom/transsion/usercenter/me/adapter/x;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/widget/TextView;Lcom/transsion/usercenter/me/adapter/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/transsion/usercenter/me/adapter/v;->a:Landroid/widget/TextView;

    iput-object p2, p0, Lcom/transsion/usercenter/me/adapter/v;->b:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/transsion/usercenter/me/adapter/v;->c:Lcom/transsion/usercenter/me/adapter/x;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/transsion/usercenter/me/adapter/v;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/transsion/usercenter/me/adapter/v;->b:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/transsion/usercenter/me/adapter/v;->c:Lcom/transsion/usercenter/me/adapter/x;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, v1, v2, p1}, Lcom/transsion/usercenter/me/adapter/x;->y(Landroid/widget/TextView;Landroid/widget/TextView;Lcom/transsion/usercenter/me/adapter/x;Ljava/lang/Integer;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
