.class public final Lcom/transsion/player/orplayer/r$e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/aliyun/player/IPlayer$OnLoadingStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/transsion/player/orplayer/r;->C(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/transsion/player/orplayer/r;


# direct methods
.method constructor <init>(Lcom/transsion/player/orplayer/r;)V
    .locals 0

    iput-object p1, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadingBegin()V
    .locals 4

    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->s(Lcom/transsion/player/orplayer/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->r(Lcom/transsion/player/orplayer/r;)Ljava/lang/String;

    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/transsion/player/orplayer/r;->u(Lcom/transsion/player/orplayer/r;Z)V

    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->q(Lcom/transsion/player/orplayer/r;)Lcom/transsion/player/orplayer/f;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v1}, Lcom/transsion/player/orplayer/r;->p(Lcom/transsion/player/orplayer/r;)Lfo/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/transsion/player/orplayer/f;->onLoadingBegin(Lfo/e;)V

    :cond_1
    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->o(Lcom/transsion/player/orplayer/r;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/transsion/player/orplayer/f;

    invoke-static {v1}, Lcom/transsion/player/orplayer/r;->p(Lcom/transsion/player/orplayer/r;)Lfo/e;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/transsion/player/orplayer/f;->onLoadingBegin(Lfo/e;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onLoadingEnd()V
    .locals 4

    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->s(Lcom/transsion/player/orplayer/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->r(Lcom/transsion/player/orplayer/r;)Ljava/lang/String;

    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/transsion/player/orplayer/r;->u(Lcom/transsion/player/orplayer/r;Z)V

    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->q(Lcom/transsion/player/orplayer/r;)Lcom/transsion/player/orplayer/f;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v1}, Lcom/transsion/player/orplayer/r;->p(Lcom/transsion/player/orplayer/r;)Lfo/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/transsion/player/orplayer/f;->onLoadingEnd(Lfo/e;)V

    :cond_1
    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->o(Lcom/transsion/player/orplayer/r;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/transsion/player/orplayer/f;

    invoke-static {v1}, Lcom/transsion/player/orplayer/r;->p(Lcom/transsion/player/orplayer/r;)Lfo/e;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/transsion/player/orplayer/f;->onLoadingEnd(Lfo/e;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onLoadingProgress(IF)V
    .locals 2

    iget-object v0, p0, Lcom/transsion/player/orplayer/r$e;->a:Lcom/transsion/player/orplayer/r;

    invoke-static {v0}, Lcom/transsion/player/orplayer/r;->r(Lcom/transsion/player/orplayer/r;)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onLoadingProgress percent:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ",netSpeed:"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    return-void
.end method
