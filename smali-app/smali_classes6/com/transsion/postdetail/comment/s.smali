.class public final synthetic Lcom/transsion/postdetail/comment/s;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lq6/a;

.field public final synthetic b:Lcom/transsion/postdetail/comment/CommentHolder;


# direct methods
.method public synthetic constructor <init>(Lq6/a;Lcom/transsion/postdetail/comment/CommentHolder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/transsion/postdetail/comment/s;->a:Lq6/a;

    iput-object p2, p0, Lcom/transsion/postdetail/comment/s;->b:Lcom/transsion/postdetail/comment/CommentHolder;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/transsion/postdetail/comment/s;->a:Lq6/a;

    iget-object v1, p0, Lcom/transsion/postdetail/comment/s;->b:Lcom/transsion/postdetail/comment/CommentHolder;

    invoke-static {v0, v1, p1}, Lcom/transsion/postdetail/comment/CommentHolder;->f(Lq6/a;Lcom/transsion/postdetail/comment/CommentHolder;Landroid/view/View;)V

    return-void
.end method
