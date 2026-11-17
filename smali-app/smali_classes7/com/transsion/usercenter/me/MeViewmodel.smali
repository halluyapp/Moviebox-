.class public final Lcom/transsion/usercenter/me/MeViewmodel;
.super Landroidx/lifecycle/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/transsion/usercenter/me/MeViewmodel$a;
    }
.end annotation


# static fields
.field public static final q:Lcom/transsion/usercenter/me/MeViewmodel$a;


# instance fields
.field private final b:Lkotlin/Lazy;

.field private final c:Lkotlin/Lazy;

.field private final d:Ljava/util/List;

.field private e:Lcom/transsion/usercenter/profile/bean/ZeroConfig;

.field private final f:Lkotlin/Lazy;

.field private g:Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;

.field private final h:I

.field private final i:Landroidx/lifecycle/b0;

.field private volatile j:Ljava/util/List;

.field private final k:Lkotlin/Lazy;

.field private final l:Lkotlin/Lazy;

.field private final m:Lkotlin/Lazy;

.field private n:Lcom/transsion/usercenter/profile/bean/MinePageInfo;

.field private final o:Landroidx/lifecycle/b0;

.field private p:Lkotlinx/coroutines/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/transsion/usercenter/me/MeViewmodel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/transsion/usercenter/me/MeViewmodel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/transsion/usercenter/me/MeViewmodel;->q:Lcom/transsion/usercenter/me/MeViewmodel$a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/lifecycle/b;-><init>(Landroid/app/Application;)V

    new-instance p1, Lcom/transsion/usercenter/me/l;

    invoke-direct {p1}, Lcom/transsion/usercenter/me/l;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->b(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->b:Lkotlin/Lazy;

    new-instance p1, Lcom/transsion/usercenter/me/m;

    invoke-direct {p1}, Lcom/transsion/usercenter/me/m;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->b(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->c:Lkotlin/Lazy;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->d:Ljava/util/List;

    new-instance p1, Lcom/transsion/usercenter/me/n;

    invoke-direct {p1}, Lcom/transsion/usercenter/me/n;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->b(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->f:Lkotlin/Lazy;

    const/16 p1, 0xa

    iput p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->h:I

    new-instance p1, Landroidx/lifecycle/b0;

    invoke-direct {p1}, Landroidx/lifecycle/b0;-><init>()V

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->i:Landroidx/lifecycle/b0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->j:Ljava/util/List;

    new-instance p1, Lcom/transsion/usercenter/me/o;

    invoke-direct {p1}, Lcom/transsion/usercenter/me/o;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->b(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->k:Lkotlin/Lazy;

    new-instance p1, Lcom/transsion/usercenter/me/p;

    invoke-direct {p1}, Lcom/transsion/usercenter/me/p;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->b(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->l:Lkotlin/Lazy;

    new-instance p1, Lcom/transsion/usercenter/me/q;

    invoke-direct {p1}, Lcom/transsion/usercenter/me/q;-><init>()V

    invoke-static {p1}, Lkotlin/LazyKt;->b(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->m:Lkotlin/Lazy;

    new-instance p1, Landroidx/lifecycle/b0;

    invoke-direct {p1}, Landroidx/lifecycle/b0;-><init>()V

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->o:Landroidx/lifecycle/b0;

    return-void
.end method

.method private final B()Lgz/a;
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgz/a;

    return-object v0
.end method

.method private final C()Lcom/transsion/usercenter/profile/b;
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/usercenter/profile/b;

    return-object v0
.end method

.method private final D()Lcom/transsion/usercenter/profile/d;
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->f:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/usercenter/profile/d;

    return-object v0
.end method

.method private final F()V
    .locals 3

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Lxm/f;->c:Lxm/f$a;

    invoke-virtual {v0}, Lxm/f$a;->a()Lxm/f;

    move-result-object v0

    const-string v1, "mine_notice_config_key"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lxm/f;->c(Ljava/lang/String;Z)Lcom/transsion/mb/config/manager/ConfigBean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/transsion/mb/config/manager/ConfigBean;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/reflect/Type;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/o;->h(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/o;->e(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;

    iput-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->g:Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    return-void
.end method

.method private final G()Lcom/transsion/baselib/db/video/ShortTVPlayDao;
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->l:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/baselib/db/video/ShortTVPlayDao;

    return-object v0
.end method

.method private final H()Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->m:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;

    return-object v0
.end method

.method private final I()Lcom/transsion/baselib/db/video/VideoDetailPlayDao;
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->k:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/baselib/db/video/VideoDetailPlayDao;

    return-object v0
.end method

.method private static final J()Lgz/a;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-class v1, Lgz/a;

    invoke-static {v1, v0}, Lcom/therouter/TheRouter;->d(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgz/a;

    return-object v0
.end method

.method private static final K()Lcom/transsion/usercenter/profile/b;
    .locals 2

    sget-object v0, Ldh/c;->e:Ldh/c$a;

    invoke-virtual {v0}, Ldh/c$a;->a()Ldh/c;

    move-result-object v0

    const-class v1, Lcom/transsion/usercenter/profile/b;

    invoke-virtual {v0, v1}, Ldh/c;->h(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/usercenter/profile/b;

    return-object v0
.end method

.method private static final L()Lcom/transsion/usercenter/profile/d;
    .locals 2

    sget-object v0, Lvw/b;->c:Lvw/b$a;

    invoke-virtual {v0}, Lvw/b$a;->a()Lvw/b;

    move-result-object v0

    const-class v1, Lcom/transsion/usercenter/profile/d;

    invoke-virtual {v0, v1}, Lvw/b;->e(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/usercenter/profile/d;

    return-object v0
.end method

.method private final M()V
    .locals 16

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->a()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, v0, Lcom/transsion/usercenter/me/MeViewmodel;->n:Lcom/transsion/usercenter/profile/bean/MinePageInfo;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getUserInfo()Lcom/transsnet/loginapi/bean/UserInfo;

    move-result-object v3

    if-nez v3, :cond_2

    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/transsion/usercenter/me/MeViewmodel;->B()Lgz/a;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lgz/a;->h()Lcom/transsnet/loginapi/bean/UserInfo;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_0
    new-instance v4, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v3}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v4, Lcom/transsion/usercenter/profile/bean/MeHistoryInfo;

    iget-object v5, v0, Lcom/transsion/usercenter/me/MeViewmodel;->j:Ljava/util/List;

    invoke-direct {v4, v5}, Lcom/transsion/usercenter/profile/bean/MeHistoryInfo;-><init>(Ljava/util/List;)V

    const/4 v5, 0x4

    invoke-direct {v3, v5, v4}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v15, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v4, Lcom/transsion/usercenter/R$string;->user_switch_profile:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget v8, Lcom/tn/lib/widget/R$drawable;->ic_me_switch_profile:I

    sget v9, Lcom/transsion/baseui/R$drawable;->bg_radius_bottom_6_color_white_6p:I

    const/16 v14, 0xe0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const-string v7, "study_mode_type"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "study_mode"

    move-object v4, v15

    move-object v0, v15

    move-object v15, v2

    invoke-direct/range {v4 .. v15}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x5

    invoke-direct {v3, v2, v0}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/transsion/usercenter/me/MeViewmodel;->o:Landroidx/lifecycle/b0;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/b0;->n(Ljava/lang/Object;)V

    return-void
.end method

.method private final N()V
    .locals 31

    move-object/from16 v0, p0

    sget-object v1, Lck/o;->a:Lck/o;

    invoke-virtual {v1}, Lck/o;->i()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct/range {p0 .. p0}, Lcom/transsion/usercenter/me/MeViewmodel;->M()V

    return-void

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v0, Lcom/transsion/usercenter/me/MeViewmodel;->n:Lcom/transsion/usercenter/profile/bean/MinePageInfo;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->a()Landroid/app/Application;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getUserInfo()Lcom/transsnet/loginapi/bean/UserInfo;

    move-result-object v6

    if-nez v6, :cond_3

    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/transsion/usercenter/me/MeViewmodel;->B()Lgz/a;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-interface {v6}, Lgz/a;->h()Lcom/transsnet/loginapi/bean/UserInfo;

    move-result-object v6

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :cond_3
    :goto_0
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getVipInfo()Lcom/transsion/memberapi/MemberInfo;

    move-result-object v7

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_1
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getNovelEntry()Lcom/transsion/usercenter/profile/bean/MineNovel;

    move-result-object v8

    goto :goto_2

    :cond_5
    const/4 v8, 0x0

    :goto_2
    const/4 v9, 0x0

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getMyGroup()Lcom/transsion/usercenter/profile/bean/MyGroup;

    move-result-object v10

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Lcom/transsion/usercenter/profile/bean/MyGroup;->getCount()I

    move-result v10

    goto :goto_3

    :cond_6
    move v10, v9

    :goto_3
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getMySubject()Lcom/transsion/usercenter/profile/bean/MySubject;

    move-result-object v11

    if-eqz v11, :cond_7

    invoke-virtual {v11}, Lcom/transsion/usercenter/profile/bean/MySubject;->getWantToSeeCount()I

    move-result v11

    goto :goto_4

    :cond_7
    move v11, v9

    :goto_4
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getFavoriteInfo()Lcom/transsion/usercenter/profile/bean/BffFavoriteInfo;

    move-result-object v12

    if-eqz v12, :cond_8

    invoke-virtual {v12}, Lcom/transsion/usercenter/profile/bean/BffFavoriteInfo;->getFavoriteCount()Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_8

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    goto :goto_5

    :cond_8
    move v12, v9

    :goto_5
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getMyPost()Lcom/transsion/usercenter/profile/bean/CountInfo;

    move-result-object v13

    if-eqz v13, :cond_9

    invoke-virtual {v13}, Lcom/transsion/usercenter/profile/bean/CountInfo;->getCount()I

    move-result v13

    goto :goto_6

    :cond_9
    move v13, v9

    :goto_6
    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getMyLike()Lcom/transsion/usercenter/profile/bean/CountInfo;

    move-result-object v14

    if-eqz v14, :cond_a

    invoke-virtual {v14}, Lcom/transsion/usercenter/profile/bean/CountInfo;->getCount()I

    move-result v14

    goto :goto_7

    :cond_a
    move v14, v9

    :goto_7
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getMyComment()Lcom/transsion/usercenter/profile/bean/CountInfo;

    move-result-object v15

    if-eqz v15, :cond_b

    invoke-virtual {v15}, Lcom/transsion/usercenter/profile/bean/CountInfo;->getCount()I

    move-result v15

    goto :goto_8

    :cond_b
    move v15, v9

    :goto_8
    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MinePageInfo;->getSubscribeInfo()Lcom/transsion/usercenter/profile/bean/SubscribeInfo;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/SubscribeInfo;->getSubscribeCount()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    :cond_c
    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    const/4 v5, 0x1

    invoke-direct {v3, v5, v6}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, v0, Lcom/transsion/usercenter/me/MeViewmodel;->g:Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;

    const/16 v6, 0x8

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;->getNoticeEnable()Z

    move-result v17

    if-eqz v17, :cond_e

    invoke-virtual {v3}, Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;->getNoticeContent()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_e

    invoke-interface/range {v17 .. v17}, Ljava/lang/CharSequence;->length()I

    move-result v17

    if-nez v17, :cond_d

    goto :goto_9

    :cond_d
    new-instance v5, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    invoke-direct {v5, v6, v3}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_9
    if-eqz v7, :cond_f

    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    const/4 v5, 0x2

    invoke-direct {v3, v5, v7}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    const/16 v5, 0xb

    const/4 v7, 0x0

    invoke-direct {v3, v5, v7}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, v0, Lcom/transsion/usercenter/me/MeViewmodel;->d:Ljava/util/List;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/transsion/usercenter/profile/bean/ZeroInfo;

    if-eqz v3, :cond_10

    new-instance v5, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    const/4 v7, 0x3

    invoke-direct {v5, v7, v3}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    if-eqz v8, :cond_11

    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    const/4 v5, 0x7

    invoke-direct {v3, v5, v8}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    sget-object v3, Lck/g;->a:Lck/g;

    invoke-virtual {v3}, Lck/g;->b()Z

    move-result v5

    if-eqz v5, :cond_12

    const-string v5, "/postdetail/favorite"

    goto :goto_a

    :cond_12
    const-string v5, "/profile/see"

    :goto_a
    invoke-virtual {v3}, Lck/g;->b()Z

    move-result v7

    if-eqz v7, :cond_13

    move v11, v12

    :cond_13
    new-instance v7, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v8, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v12, Lcom/transsion/usercenter/R$string;->profile_your_list:I

    invoke-virtual {v4, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v20

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "oneroom://com.community.oneroom"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    sget v22, Lcom/tn/lib/widget/R$drawable;->ic_me_my_list:I

    sget v23, Lcom/transsion/baseui/R$drawable;->bg_radius_top_6_color_white_6p:I

    invoke-static {v6}, Lfk/a;->b(I)I

    move-result v25

    const/16 v28, 0x80

    const/16 v29, 0x0

    const/16 v24, 0x1

    const/16 v26, 0x0

    const-string v27, "want_to_see"

    move-object/from16 v18, v8

    invoke-direct/range {v18 .. v29}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    invoke-direct {v7, v5, v8}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v7, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v8, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v11, Lcom/tn/lib/widget/R$string;->my_likes:I

    invoke-virtual {v4, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v20

    sget v22, Lcom/tn/lib/widget/R$drawable;->ic_me_likes:I

    sget v23, Lcom/tn/lib/widget/R$color;->white_6:I

    const/16 v28, 0xc0

    const-string v21, "like_list_type"

    const/16 v25, 0x0

    const-string v27, "like"

    move-object/from16 v18, v8

    invoke-direct/range {v18 .. v29}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v7, v5, v8}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lck/g;->b()Z

    move-result v7

    if-eqz v7, :cond_14

    new-instance v7, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v8, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v11, Lcom/transsion/usercenter/R$string;->profile_my_subscribers:I

    invoke-virtual {v4, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v20

    sget v22, Lcom/tn/lib/widget/R$drawable;->ic_me_subscriptions:I

    sget v23, Lcom/tn/lib/widget/R$color;->white_6:I

    const/16 v28, 0xc0

    const/16 v29, 0x0

    const-string v21, "subscribe_list_type"

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-string v27, "subscribe"

    move-object/from16 v18, v8

    invoke-direct/range {v18 .. v29}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v7, v5, v8}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_14
    new-instance v7, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v8, Lcom/transsion/usercenter/profile/bean/MeHistoryInfo;

    iget-object v9, v0, Lcom/transsion/usercenter/me/MeViewmodel;->j:Ljava/util/List;

    invoke-direct {v8, v9}, Lcom/transsion/usercenter/profile/bean/MeHistoryInfo;-><init>(Ljava/util/List;)V

    const/4 v9, 0x4

    invoke-direct {v7, v9, v8}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v7, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v7, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v8, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v9, Lcom/transsion/usercenter/R$string;->profile_my_room:I

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v20

    invoke-direct/range {p0 .. p0}, Lcom/transsion/usercenter/me/MeViewmodel;->B()Lgz/a;

    move-result-object v9

    if-eqz v9, :cond_15

    invoke-interface {v9}, Lgz/a;->a()Z

    move-result v9

    const/4 v10, 0x1

    if-ne v9, v10, :cond_15

    const-string v9, "oneroom://com.community.oneroom/room/list"

    :goto_b
    move-object/from16 v21, v9

    goto :goto_c

    :cond_15
    const-string v9, "oneroom://com.community.oneroom/room/list?index=1"

    goto :goto_b

    :goto_c
    sget v22, Lcom/tn/lib/widget/R$drawable;->ic_me_room:I

    sget v23, Lcom/transsion/baseui/R$drawable;->bg_radius_top_6_color_white_6p:I

    invoke-static {v6}, Lfk/a;->b(I)I

    move-result v25

    const/16 v26, 0x0

    const-string v27, "myrooms"

    const/16 v24, 0x1

    move-object/from16 v18, v8

    invoke-direct/range {v18 .. v27}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;)V

    invoke-direct {v7, v5, v8}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lck/g;->b()Z

    move-result v3

    if-nez v3, :cond_16

    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v7, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v8, Lcom/transsion/usercenter/R$string;->profile_post:I

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v18

    sget v20, Lcom/tn/lib/widget/R$drawable;->ic_mine_post:I

    sget v21, Lcom/tn/lib/widget/R$color;->white_6:I

    const/16 v26, 0x40

    const/16 v27, 0x0

    const-string v19, "post_list_type"

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x1

    const-string v25, "post"

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v27}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v5, v7}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_16
    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v7, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v8, Lcom/transsion/baseui/R$string;->my_comments:I

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v17

    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v18

    sget v20, Lcom/tn/lib/widget/R$drawable;->ic_me_comments:I

    sget v21, Lcom/transsion/baseui/R$drawable;->bg_radius_bottom_6_color_white_6p:I

    const/16 v26, 0x60

    const/16 v27, 0x0

    const-string v19, "oneroom://com.community.oneroom/post/my_comment"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const-string v25, "comments"

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v27}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v5, v7}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    sget v7, Lcom/transsion/usercenter/R$string;->user_setting:I

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    sget v12, Lcom/tn/lib/widget/R$drawable;->ic_me_setting:I

    sget v13, Lcom/transsion/baseui/R$drawable;->bg_radius_top_6_color_white_6p:I

    invoke-static {v6}, Lfk/a;->b(I)I

    move-result v15

    new-instance v6, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    const/16 v18, 0x80

    const/16 v19, 0x0

    const/4 v10, 0x0

    const-string v11, "oneroom://com.community.oneroom/profile/setting"

    const/4 v14, 0x1

    const/16 v16, 0x0

    const-string v17, "setting"

    move-object v8, v6

    invoke-direct/range {v8 .. v19}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v5, v6}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, Lcom/transsion/baselib/kids/KidsAccountManager;->a:Lcom/transsion/baselib/kids/KidsAccountManager;

    invoke-virtual {v3}, Lcom/transsion/baselib/kids/KidsAccountManager;->e()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_19

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_17

    goto :goto_f

    :cond_17
    invoke-virtual {v1}, Lck/o;->j()Z

    move-result v7

    if-eqz v7, :cond_19

    new-instance v7, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v15, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v8, Lcom/transsion/usercenter/R$string;->user_parental_pin:I

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/transsion/baselib/kids/KidsAccountManager;->i()Z

    move-result v3

    if-nez v3, :cond_18

    sget v3, Lcom/transsion/usercenter/R$string;->user_parental_pin_hint:I

    :goto_d
    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object v10, v3

    goto :goto_e

    :cond_18
    sget v3, Lcom/transsion/usercenter/R$string;->user_parental_pin_hint_on:I

    goto :goto_d

    :goto_e
    sget v12, Lcom/tn/lib/widget/R$drawable;->ic_user_kids_settings_pin:I

    sget v13, Lcom/tn/lib/widget/R$color;->white_6:I

    const/16 v18, 0xc0

    const/16 v19, 0x0

    const-string v11, "parental_pin_type"

    const/4 v14, 0x1

    const/4 v3, 0x0

    const/16 v16, 0x0

    const-string v17, "parental_pin"

    move-object v8, v15

    move-object/from16 v30, v15

    move v15, v3

    invoke-direct/range {v8 .. v19}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v30

    invoke-direct {v7, v5, v3}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_19
    :goto_f
    invoke-virtual {v1}, Lck/o;->j()Z

    move-result v1

    if-eqz v1, :cond_1c

    new-instance v1, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v3, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v7, Lcom/transsion/usercenter/R$string;->user_safe_kids:I

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v6, :cond_1b

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_1a

    goto :goto_11

    :cond_1a
    sget v6, Lcom/transsion/usercenter/R$string;->user_switch_profile:I

    :goto_10
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v9, v6

    goto :goto_12

    :cond_1b
    :goto_11
    sget v6, Lcom/transsion/usercenter/R$string;->user_create_study_profile:I

    goto :goto_10

    :goto_12
    sget v11, Lcom/tn/lib/widget/R$drawable;->ic_me_study_mode:I

    sget v12, Lcom/tn/lib/widget/R$color;->white_6:I

    const/16 v17, 0xc0

    const/16 v18, 0x0

    const-string v10, "study_mode_type"

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v16, "study_mode"

    move-object v7, v3

    invoke-direct/range {v7 .. v18}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v5, v3}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1c
    new-instance v1, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    new-instance v3, Lcom/transsion/usercenter/profile/bean/IconItemInfo;

    sget v6, Lcom/transsion/usercenter/R$string;->user_setting_feedback:I

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    sget v10, Lcom/tn/lib/widget/R$drawable;->ic_me_feedback:I

    sget v11, Lcom/transsion/baseui/R$drawable;->bg_radius_bottom_6_color_white_6p:I

    const/16 v16, 0xe0

    const/16 v17, 0x0

    const/4 v8, 0x0

    const-string v9, "oneroom://com.community.oneroom/profile/user_center_labels_feedback"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-string v15, "feedback"

    move-object v6, v3

    invoke-direct/range {v6 .. v17}, Lcom/transsion/usercenter/profile/bean/IconItemInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v5, v3}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/transsion/usercenter/me/MeViewmodel;->g:Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;

    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Lcom/transsion/usercenter/profile/bean/MineNoticeConfig;->getBottomContent()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1e

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1d

    goto :goto_13

    :cond_1d
    new-instance v3, Lcom/transsion/usercenter/profile/bean/MeItemInfo;

    const/16 v4, 0x9

    invoke-direct {v3, v4, v1}, Lcom/transsion/usercenter/profile/bean/MeItemInfo;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1e
    :goto_13
    iget-object v1, v0, Lcom/transsion/usercenter/me/MeViewmodel;->o:Landroidx/lifecycle/b0;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/b0;->n(Ljava/lang/Object;)V

    return-void
.end method

.method private static final O()Lcom/transsion/baselib/db/video/ShortTVPlayDao;
    .locals 3

    sget-object v0, Lcom/transsion/baselib/db/AppDatabase;->p:Lcom/transsion/baselib/db/AppDatabase$f1;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->a()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApp(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/transsion/baselib/db/AppDatabase$f1;->b(Landroid/content/Context;)Lcom/transsion/baselib/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/transsion/baselib/db/AppDatabase;->v1()Lcom/transsion/baselib/db/video/ShortTVPlayDao;

    move-result-object v0

    return-object v0
.end method

.method private static final P()Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;
    .locals 3

    sget-object v0, Lcom/transsion/baselib/db/AppDatabase;->p:Lcom/transsion/baselib/db/AppDatabase$f1;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->a()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApp(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/transsion/baselib/db/AppDatabase$f1;->b(Landroid/content/Context;)Lcom/transsion/baselib/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/transsion/baselib/db/AppDatabase;->A1()Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;

    move-result-object v0

    return-object v0
.end method

.method private static final Q()Lcom/transsion/baselib/db/video/VideoDetailPlayDao;
    .locals 3

    sget-object v0, Lcom/transsion/baselib/db/AppDatabase;->p:Lcom/transsion/baselib/db/AppDatabase$f1;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->a()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApp(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/transsion/baselib/db/AppDatabase$f1;->b(Landroid/content/Context;)Lcom/transsion/baselib/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/transsion/baselib/db/AppDatabase;->B1()Lcom/transsion/baselib/db/video/VideoDetailPlayDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lcom/transsion/baselib/db/video/VideoDetailPlayDao;
    .locals 1

    invoke-static {}, Lcom/transsion/usercenter/me/MeViewmodel;->Q()Lcom/transsion/baselib/db/video/VideoDetailPlayDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;
    .locals 1

    invoke-static {}, Lcom/transsion/usercenter/me/MeViewmodel;->P()Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lgz/a;
    .locals 1

    invoke-static {}, Lcom/transsion/usercenter/me/MeViewmodel;->J()Lgz/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lcom/transsion/usercenter/profile/b;
    .locals 1

    invoke-static {}, Lcom/transsion/usercenter/me/MeViewmodel;->K()Lcom/transsion/usercenter/profile/b;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Lcom/transsion/baselib/db/video/ShortTVPlayDao;
    .locals 1

    invoke-static {}, Lcom/transsion/usercenter/me/MeViewmodel;->O()Lcom/transsion/baselib/db/video/ShortTVPlayDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Lcom/transsion/usercenter/profile/d;
    .locals 1

    invoke-static {}, Lcom/transsion/usercenter/me/MeViewmodel;->L()Lcom/transsion/usercenter/profile/d;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic i(Lcom/transsion/usercenter/me/MeViewmodel;)I
    .locals 0

    iget p0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->h:I

    return p0
.end method

.method public static final synthetic j(Lcom/transsion/usercenter/me/MeViewmodel;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->j:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic k(Lcom/transsion/usercenter/me/MeViewmodel;)Lgz/a;
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->B()Lgz/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/transsion/usercenter/me/MeViewmodel;)Lcom/transsion/usercenter/profile/b;
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->C()Lcom/transsion/usercenter/profile/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/transsion/usercenter/me/MeViewmodel;)Lcom/transsion/usercenter/profile/d;
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->D()Lcom/transsion/usercenter/profile/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/transsion/usercenter/me/MeViewmodel;)V
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->F()V

    return-void
.end method

.method public static final synthetic o(Lcom/transsion/usercenter/me/MeViewmodel;)Lcom/transsion/baselib/db/video/ShortTVPlayDao;
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->G()Lcom/transsion/baselib/db/video/ShortTVPlayDao;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/transsion/usercenter/me/MeViewmodel;)Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->H()Lcom/transsion/baselib/db/video/UGCVideoDetailPlayDao;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lcom/transsion/usercenter/me/MeViewmodel;)Lcom/transsion/baselib/db/video/VideoDetailPlayDao;
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->I()Lcom/transsion/baselib/db/video/VideoDetailPlayDao;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lcom/transsion/usercenter/me/MeViewmodel;)Lcom/transsion/usercenter/profile/bean/ZeroConfig;
    .locals 0

    iget-object p0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->e:Lcom/transsion/usercenter/profile/bean/ZeroConfig;

    return-object p0
.end method

.method public static final synthetic s(Lcom/transsion/usercenter/me/MeViewmodel;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->d:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic t(Lcom/transsion/usercenter/me/MeViewmodel;)V
    .locals 0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->N()V

    return-void
.end method

.method public static final synthetic u(Lcom/transsion/usercenter/me/MeViewmodel;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->j:Ljava/util/List;

    return-void
.end method

.method public static final synthetic v(Lcom/transsion/usercenter/me/MeViewmodel;Lcom/transsion/usercenter/profile/bean/MinePageInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/transsion/usercenter/me/MeViewmodel;->n:Lcom/transsion/usercenter/profile/bean/MinePageInfo;

    return-void
.end method

.method private final z()V
    .locals 3

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Lxm/f;->c:Lxm/f$a;

    invoke-virtual {v0}, Lxm/f$a;->a()Lxm/f;

    move-result-object v0

    const-string v1, "free_buy_config"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lxm/f;->c(Ljava/lang/String;Z)Lcom/transsion/mb/config/manager/ConfigBean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/transsion/mb/config/manager/ConfigBean;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lcom/transsion/usercenter/profile/bean/ZeroConfig;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/reflect/Type;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/o;->h(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/o;->e(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/transsion/usercenter/profile/bean/ZeroConfig;

    iput-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->e:Lcom/transsion/usercenter/profile/bean/ZeroConfig;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    return-void
.end method


# virtual methods
.method public final A()Landroidx/lifecycle/b0;
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->i:Landroidx/lifecycle/b0;

    return-object v0
.end method

.method public final E()Landroidx/lifecycle/b0;
    .locals 1

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->o:Landroidx/lifecycle/b0;

    return-object v0
.end method

.method public final w()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/u0;->a(Landroidx/lifecycle/t0;)Lkotlinx/coroutines/n0;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/i0;

    move-result-object v1

    new-instance v3, Lcom/transsion/usercenter/me/MeViewmodel$fetchHistory$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/transsion/usercenter/me/MeViewmodel$fetchHistory$1;-><init>(Lcom/transsion/usercenter/me/MeViewmodel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/i;->d(Lkotlinx/coroutines/n0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/t1;

    return-void
.end method

.method public final x()V
    .locals 9

    invoke-virtual {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->w()V

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->p:Lkotlinx/coroutines/t1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/t1$a;->b(Lkotlinx/coroutines/t1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/u0;->a(Landroidx/lifecycle/t0;)Lkotlinx/coroutines/n0;

    move-result-object v3

    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/i0;

    move-result-object v4

    new-instance v6, Lcom/transsion/usercenter/me/MeViewmodel$fetchProfile$1;

    invoke-direct {v6, p0, v1}, Lcom/transsion/usercenter/me/MeViewmodel$fetchProfile$1;-><init>(Lcom/transsion/usercenter/me/MeViewmodel;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/i;->d(Lkotlinx/coroutines/n0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/t1;

    move-result-object v0

    iput-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->p:Lkotlinx/coroutines/t1;

    return-void
.end method

.method public final y()V
    .locals 8

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->e:Lcom/transsion/usercenter/profile/bean/ZeroConfig;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/transsion/usercenter/me/MeViewmodel;->z()V

    :cond_0
    sget-object v1, Lpg/a;->a:Lpg/a$a;

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->e:Lcom/transsion/usercenter/profile/bean/ZeroConfig;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zeroConfig:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "MeViewmodel"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lpg/a$a;->f(Lpg/a$a;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object v0, p0, Lcom/transsion/usercenter/me/MeViewmodel;->e:Lcom/transsion/usercenter/profile/bean/ZeroConfig;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/transsion/usercenter/profile/bean/ZeroConfig;->getEnable()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-static {p0}, Landroidx/lifecycle/u0;->a(Landroidx/lifecycle/t0;)Lkotlinx/coroutines/n0;

    move-result-object v2

    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/i0;

    move-result-object v3

    new-instance v5, Lcom/transsion/usercenter/me/MeViewmodel$fetchPurchase$1;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lcom/transsion/usercenter/me/MeViewmodel$fetchPurchase$1;-><init>(Lcom/transsion/usercenter/me/MeViewmodel;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/i;->d(Lkotlinx/coroutines/n0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/t1;

    :cond_1
    return-void
.end method
