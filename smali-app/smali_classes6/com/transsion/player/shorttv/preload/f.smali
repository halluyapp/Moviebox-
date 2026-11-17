.class public final synthetic Lcom/transsion/player/shorttv/preload/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lfo/e;

.field public final synthetic b:Lcom/transsion/player/shorttv/preload/g;


# direct methods
.method public synthetic constructor <init>(Lfo/e;Lcom/transsion/player/shorttv/preload/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/transsion/player/shorttv/preload/f;->a:Lfo/e;

    iput-object p2, p0, Lcom/transsion/player/shorttv/preload/f;->b:Lcom/transsion/player/shorttv/preload/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/shorttv/preload/f;->a:Lfo/e;

    iget-object v1, p0, Lcom/transsion/player/shorttv/preload/f;->b:Lcom/transsion/player/shorttv/preload/g;

    invoke-static {v0, v1}, Lcom/transsion/player/shorttv/preload/g;->b(Lfo/e;Lcom/transsion/player/shorttv/preload/g;)V

    return-void
.end method
