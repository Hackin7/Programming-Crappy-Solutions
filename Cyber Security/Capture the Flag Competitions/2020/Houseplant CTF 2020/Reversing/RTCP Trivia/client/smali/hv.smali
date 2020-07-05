.class final Lhv;
.super Lhu;

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhv$e;,
        Lhv$d;,
        Lhv$a;,
        Lhv$b;,
        Lhv$c;,
        Lhv$h;,
        Lhv$g;,
        Lhv$f;
    }
.end annotation


# static fields
.field static final F:Landroid/view/animation/Interpolator;

.field static final G:Landroid/view/animation/Interpolator;

.field static final H:Landroid/view/animation/Interpolator;

.field static final I:Landroid/view/animation/Interpolator;

.field static a:Z = false

.field static q:Ljava/lang/reflect/Field;


# instance fields
.field A:Landroid/os/Bundle;

.field B:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field C:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhv$h;",
            ">;"
        }
    .end annotation
.end field

.field D:Lhw;

.field E:Ljava/lang/Runnable;

.field private final J:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhv$g;",
            ">;"
        }
    .end annotation
.end field

.field c:Z

.field d:I

.field final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhp;",
            ">;"
        }
    .end annotation
.end field

.field f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lhp;",
            ">;"
        }
    .end annotation
.end field

.field g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;"
        }
    .end annotation
.end field

.field h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhp;",
            ">;"
        }
    .end annotation
.end field

.field i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;"
        }
    .end annotation
.end field

.field j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field l:I

.field m:Lht;

.field n:Lhr;

.field o:Lhp;

.field p:Lhp;

.field r:Z

.field s:Z

.field t:Z

.field u:Z

.field v:Ljava/lang/String;

.field w:Z

.field x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;"
        }
    .end annotation
.end field

.field y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lhp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x40200000    # 2.5f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Lhv;->F:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-direct {v0, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Lhv;->G:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v1}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Lhv;->H:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v2}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Lhv;->I:Landroid/view/animation/Interpolator;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lhu;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lhv;->d:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput v0, p0, Lhv;->l:I

    const/4 v0, 0x0

    iput-object v0, p0, Lhv;->A:Landroid/os/Bundle;

    iput-object v0, p0, Lhv;->B:Landroid/util/SparseArray;

    new-instance v0, Lhv$1;

    invoke-direct {v0, p0}, Lhv$1;-><init>(Lhv;)V

    iput-object v0, p0, Lhv;->E:Ljava/lang/Runnable;

    return-void
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;IILdf;)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II",
            "Ldf<",
            "Lhp;",
            ">;)I"
        }
    .end annotation

    add-int/lit8 v0, p4, -0x1

    move v1, p4

    :goto_0
    if-lt v0, p3, :cond_7

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    iget-object v6, v2, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x1

    if-ge v5, v6, :cond_1

    iget-object v6, v2, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhn$a;

    invoke-static {v6}, Lhn;->a(Lhn$a;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v5, v7

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_2
    if-eqz v5, :cond_2

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {v2, p1, v5, p4}, Lhn;->a(Ljava/util/ArrayList;II)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_3

    :cond_2
    move v7, v4

    :goto_3
    if-eqz v7, :cond_6

    iget-object v5, p0, Lhv;->C:Ljava/util/ArrayList;

    if-nez v5, :cond_3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lhv;->C:Ljava/util/ArrayList;

    :cond_3
    new-instance v5, Lhv$h;

    invoke-direct {v5, v2, v3}, Lhv$h;-><init>(Lhn;Z)V

    iget-object v6, p0, Lhv;->C:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v5}, Lhn;->a(Lhp$c;)V

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lhn;->b()V

    goto :goto_4

    :cond_4
    invoke-virtual {v2, v4}, Lhn;->a(Z)V

    :goto_4
    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_5

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p1, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_5
    invoke-direct {p0, p5}, Lhv;->b(Ldf;)V

    :cond_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_7
    return v1
.end method

.method private static a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation$AnimationListener;
    .locals 2

    :try_start_0
    sget-object v0, Lhv;->q:Ljava/lang/reflect/Field;

    if-nez v0, :cond_0

    const-class v0, Landroid/view/animation/Animation;

    const-string v1, "mListener"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Lhv;->q:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    :cond_0
    sget-object v0, Lhv;->q:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/animation/Animation$AnimationListener;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "FragmentManager"

    const-string v1, "Cannot access Animation\'s mListener field"

    goto :goto_0

    :catch_1
    move-exception p0

    const-string v0, "FragmentManager"

    const-string v1, "No field with the name mListener is found in Animation class"

    :goto_0
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method private a(Landroid/os/Bundle;Ljava/lang/String;)Lhp;
    .locals 4

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhp;

    if-nez v0, :cond_1

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fragment no longer exists for key "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": index "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lhv;->a(Ljava/lang/RuntimeException;)V

    :cond_1
    return-object v0
.end method

.method private static a(FF)Lhv$c;
    .locals 1

    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, p0, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    sget-object p0, Lhv;->G:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p0}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const-wide/16 p0, 0xdc

    invoke-virtual {v0, p0, p1}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    new-instance p0, Lhv$c;

    invoke-direct {p0, v0}, Lhv$c;-><init>(Landroid/view/animation/Animation;)V

    return-object p0
.end method

.method private static a(FFFF)Lhv$c;
    .locals 11

    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    new-instance v1, Landroid/view/animation/ScaleAnimation;

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v9, 0x1

    const/high16 v10, 0x3f000000    # 0.5f

    move-object v2, v1

    move v3, p0

    move v4, p1

    move v5, p0

    move v6, p1

    invoke-direct/range {v2 .. v10}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    sget-object p0, Lhv;->F:Landroid/view/animation/Interpolator;

    invoke-virtual {v1, p0}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const-wide/16 p0, 0xdc

    invoke-virtual {v1, p0, p1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    new-instance v1, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v1, p2, p3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    sget-object p2, Lhv;->G:Landroid/view/animation/Interpolator;

    invoke-virtual {v1, p2}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    invoke-virtual {v1, p0, p1}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    new-instance p0, Lhv$c;

    invoke-direct {p0, v0}, Lhv$c;-><init>(Landroid/view/animation/Animation;)V

    return-object p0
.end method

.method private a(Lhp;IZI)Lhv$c;
    .locals 5

    invoke-virtual {p1}, Lhp;->B()I

    move-result p1

    invoke-static {}, Lhp;->l()Landroid/view/animation/Animation;

    invoke-static {}, Lhp;->m()Landroid/animation/Animator;

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    iget-object v1, p0, Lhv;->m:Lht;

    iget-object v1, v1, Lht;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "anim"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v3, p0, Lhv;->m:Lht;

    iget-object v3, v3, Lht;->c:Landroid/content/Context;

    invoke-static {v3, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v4, Lhv$c;

    invoke-direct {v4, v3}, Lhv$c;-><init>(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v4

    :cond_0
    move v2, v0

    goto :goto_0

    :catch_0
    move-exception p1

    throw p1

    :catch_1
    :cond_1
    :goto_0
    if-nez v2, :cond_3

    :try_start_1
    iget-object v2, p0, Lhv;->m:Lht;

    iget-object v2, v2, Lht;->c:Landroid/content/Context;

    invoke-static {v2, p1}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v3, Lhv$c;

    invoke-direct {v3, v2}, Lhv$c;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v3

    :catch_2
    move-exception v2

    if-eqz v1, :cond_2

    throw v2

    :cond_2
    iget-object v1, p0, Lhv;->m:Lht;

    iget-object v1, v1, Lht;->c:Landroid/content/Context;

    invoke-static {v1, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance p2, Lhv$c;

    invoke-direct {p2, p1}, Lhv$c;-><init>(Landroid/view/animation/Animation;)V

    return-object p2

    :cond_3
    const/4 p1, 0x0

    if-nez p2, :cond_4

    return-object p1

    :cond_4
    const/4 v1, -0x1

    const/16 v2, 0x1001

    if-eq p2, v2, :cond_9

    const/16 v0, 0x1003

    if-eq p2, v0, :cond_7

    const/16 v0, 0x2002

    if-eq p2, v0, :cond_5

    goto :goto_3

    :cond_5
    if-eqz p3, :cond_6

    const/4 p2, 0x3

    :goto_1
    move v1, p2

    goto :goto_3

    :cond_6
    const/4 p2, 0x4

    goto :goto_1

    :cond_7
    if-eqz p3, :cond_8

    const/4 p2, 0x5

    goto :goto_1

    :cond_8
    const/4 p2, 0x6

    goto :goto_1

    :cond_9
    if-eqz p3, :cond_a

    :goto_2
    move v1, v0

    goto :goto_3

    :cond_a
    const/4 v0, 0x2

    goto :goto_2

    :goto_3
    if-gez v1, :cond_b

    return-object p1

    :cond_b
    const p2, 0x3f79999a    # 0.975f

    const/4 p3, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    packed-switch v1, :pswitch_data_0

    if-nez p4, :cond_c

    iget-object p2, p0, Lhv;->m:Lht;

    invoke-virtual {p2}, Lht;->e()Z

    move-result p2

    if-eqz p2, :cond_c

    iget-object p2, p0, Lhv;->m:Lht;

    invoke-virtual {p2}, Lht;->f()I

    move-result p4

    goto :goto_4

    :pswitch_0
    invoke-static {v0, p3}, Lhv;->a(FF)Lhv$c;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p3, v0}, Lhv;->a(FF)Lhv$c;

    move-result-object p1

    return-object p1

    :pswitch_2
    const p1, 0x3f89999a    # 1.075f

    invoke-static {v0, p1, v0, p3}, Lhv;->a(FFFF)Lhv$c;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p2, v0, p3, v0}, Lhv;->a(FFFF)Lhv$c;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-static {v0, p2, v0, p3}, Lhv;->a(FFFF)Lhv$c;

    move-result-object p1

    return-object p1

    :pswitch_5
    const/high16 p1, 0x3f900000    # 1.125f

    invoke-static {p1, v0, p3, v0}, Lhv;->a(FFFF)Lhv$c;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_4
    if-nez p4, :cond_d

    :cond_d
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(ILhn;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lhv;->i:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhv;->i:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lhv;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_1

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Setting back stack index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, Lhv;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    :goto_0
    if-ge v0, p1, :cond_5

    iget-object v1, p0, Lhv;->i:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lhv;->j:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lhv;->j:Ljava/util/ArrayList;

    :cond_3
    sget-boolean v1, Lhv;->a:Z

    if-eqz v1, :cond_4

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Adding available back stack index "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v1, p0, Lhv;->j:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_6

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Adding back stack index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " with "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    iget-object p1, p0, Lhv;->i:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static a(Landroid/view/View;Lhv$c;)V
    .locals 5

    if-eqz p0, :cond_8

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_6

    if-nez p1, :cond_1

    goto :goto_3

    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-lt v2, v3, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getLayerType()I

    move-result v2

    if-nez v2, :cond_6

    invoke-static {p0}, Lgq;->h(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Lhv$c;->a:Landroid/view/animation/Animation;

    instance-of v2, v2, Landroid/view/animation/AlphaAnimation;

    if-eqz v2, :cond_2

    :goto_0
    move v2, v1

    goto :goto_2

    :cond_2
    iget-object v2, p1, Lhv$c;->a:Landroid/view/animation/Animation;

    instance-of v2, v2, Landroid/view/animation/AnimationSet;

    if-eqz v2, :cond_5

    iget-object v2, p1, Lhv$c;->a:Landroid/view/animation/Animation;

    check-cast v2, Landroid/view/animation/AnimationSet;

    invoke-virtual {v2}, Landroid/view/animation/AnimationSet;->getAnimations()Ljava/util/List;

    move-result-object v2

    move v3, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_4

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Landroid/view/animation/AlphaAnimation;

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    move v2, v0

    goto :goto_2

    :cond_5
    iget-object v2, p1, Lhv$c;->b:Landroid/animation/Animator;

    invoke-static {v2}, Lhv;->a(Landroid/animation/Animator;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_6

    move v0, v1

    :cond_6
    :goto_3
    if-eqz v0, :cond_8

    iget-object v0, p1, Lhv$c;->b:Landroid/animation/Animator;

    if-eqz v0, :cond_7

    iget-object p1, p1, Lhv$c;->b:Landroid/animation/Animator;

    new-instance v0, Lhv$d;

    invoke-direct {v0, p0}, Lhv$d;-><init>(Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :cond_7
    iget-object v0, p1, Lhv$c;->a:Landroid/view/animation/Animation;

    invoke-static {v0}, Lhv;->a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation$AnimationListener;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object p1, p1, Lhv$c;->a:Landroid/view/animation/Animation;

    new-instance v1, Lhv$a;

    invoke-direct {v1, p0, v0}, Lhv$a;-><init>(Landroid/view/View;Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {p1, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_8
    return-void
.end method

.method private static a(Ldf;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf<",
            "Lhp;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ldf;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Ldf;->a:[Ljava/lang/Object;

    aget-object v2, v2, v1

    check-cast v2, Lhp;

    iget-boolean v3, v2, Lhp;->l:Z

    if-nez v3, :cond_0

    iget-object v3, v2, Lhp;->J:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    move-result v4

    iput v4, v2, Lhp;->Q:F

    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Lhp;Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1, p2}, Lhv;->a(Lhp;Landroid/content/Context;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Lhp;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1, p2}, Lhv;->a(Lhp;Landroid/os/Bundle;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Lhp;Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1, p2, p3}, Lhv;->a(Lhp;Landroid/view/View;Landroid/os/Bundle;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method static a(Lhw;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lhw;->a:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lhp;->E:Z

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lhw;->b:Ljava/util/List;

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhw;

    invoke-static {v0}, Lhv;->a(Lhw;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method private a(Ljava/lang/RuntimeException;)V
    .locals 4

    const-string v0, "FragmentManager"

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FragmentManager"

    const-string v1, "Activity state:"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lga;

    const-string v1, "FragmentManager"

    invoke-direct {v0, v1}, Lga;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, Lhv;->m:Lht;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lhv;->m:Lht;

    const-string v3, "  "

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, v3, v1, v2}, Lht;->a(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "FragmentManager"

    const-string v2, "Failed dumping state"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v0, "  "

    const/4 v3, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {p0, v0, v3, v1, v2}, Lhv;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    throw p1
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lhv;->C:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhv;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    move v2, v0

    move v0, v1

    :goto_1
    if-ge v0, v2, :cond_6

    iget-object v3, p0, Lhv;->C:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhv$h;

    const/4 v4, 0x1

    const/4 v5, -0x1

    if-eqz p1, :cond_1

    iget-boolean v6, v3, Lhv$h;->a:Z

    if-nez v6, :cond_1

    iget-object v6, v3, Lhv$h;->b:Lhn;

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v6

    if-eq v6, v5, :cond_1

    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_1

    :goto_2
    invoke-virtual {v3}, Lhv$h;->d()V

    goto :goto_4

    :cond_1
    iget v6, v3, Lhv$h;->c:I

    if-nez v6, :cond_2

    move v6, v4

    goto :goto_3

    :cond_2
    move v6, v1

    :goto_3
    if-nez v6, :cond_3

    if-eqz p1, :cond_5

    iget-object v6, v3, Lhv$h;->b:Lhn;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v6, p1, v1, v7}, Lhn;->a(Ljava/util/ArrayList;II)Z

    move-result v6

    if-eqz v6, :cond_5

    :cond_3
    iget-object v6, p0, Lhv;->C:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v2, v2, -0x1

    if-eqz p1, :cond_4

    iget-boolean v6, v3, Lhv$h;->a:Z

    if-nez v6, :cond_4

    iget-object v6, v3, Lhv$h;->b:Lhn;

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v6

    if-eq v6, v5, :cond_4

    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Lhv$h;->c()V

    :cond_5
    :goto_4
    add-int/2addr v0, v4

    goto :goto_1

    :cond_6
    return-void
.end method

.method private a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p3

    move/from16 v11, p4

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhn;

    iget-boolean v12, v1, Lhn;->t:Z

    iget-object v1, v7, Lhv;->z:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v7, Lhv;->z:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    iget-object v1, v7, Lhv;->z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v1, v7, Lhv;->z:Ljava/util/ArrayList;

    iget-object v2, v7, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v7, Lhv;->p:Lhp;

    const/4 v2, 0x0

    move-object v3, v1

    move v13, v2

    move v1, v10

    :goto_1
    const/4 v14, 0x1

    if-ge v1, v11, :cond_4

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhn;

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v5, v7, Lhv;->z:Ljava/util/ArrayList;

    invoke-virtual {v4, v5, v3}, Lhn;->a(Ljava/util/ArrayList;Lhp;)Lhp;

    move-result-object v3

    goto :goto_2

    :cond_1
    iget-object v5, v7, Lhv;->z:Ljava/util/ArrayList;

    invoke-virtual {v4, v5, v3}, Lhn;->b(Ljava/util/ArrayList;Lhp;)Lhp;

    move-result-object v3

    :goto_2
    if-nez v13, :cond_3

    iget-boolean v4, v4, Lhn;->i:Z

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    move v13, v2

    goto :goto_4

    :cond_3
    :goto_3
    move v13, v14

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    iget-object v1, v7, Lhv;->z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v12, :cond_5

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, v8

    move-object v3, v9

    move v4, v10

    move v5, v11

    invoke-static/range {v1 .. v6}, Lia;->a(Lhv;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    :cond_5
    invoke-static/range {p1 .. p4}, Lhv;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    if-eqz v12, :cond_6

    new-instance v15, Ldf;

    invoke-direct {v15}, Ldf;-><init>()V

    invoke-direct {v7, v15}, Lhv;->b(Ldf;)V

    move-object v1, v7

    move-object v2, v8

    move-object v3, v9

    move v4, v10

    move v5, v11

    move-object v6, v15

    invoke-direct/range {v1 .. v6}, Lhv;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;IILdf;)I

    move-result v1

    invoke-static {v15}, Lhv;->a(Ldf;)V

    move v5, v1

    goto :goto_5

    :cond_6
    move v5, v11

    :goto_5
    if-eq v5, v10, :cond_7

    if-eqz v12, :cond_7

    const/4 v6, 0x1

    move-object v1, v7

    move-object v2, v8

    move-object v3, v9

    move v4, v10

    invoke-static/range {v1 .. v6}, Lia;->a(Lhv;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    iget v1, v7, Lhv;->l:I

    invoke-virtual {v7, v1, v14}, Lhv;->a(IZ)V

    :cond_7
    :goto_6
    if-ge v10, v11, :cond_b

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhn;

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_a

    iget v2, v1, Lhn;->m:I

    if-ltz v2, :cond_a

    iget v2, v1, Lhn;->m:I

    monitor-enter p0

    :try_start_0
    iget-object v3, v7, Lhv;->i:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v7, Lhv;->j:Ljava/util/ArrayList;

    if-nez v3, :cond_8

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v7, Lhv;->j:Ljava/util/ArrayList;

    :cond_8
    sget-boolean v3, Lhv;->a:Z

    if-eqz v3, :cond_9

    const-string v3, "FragmentManager"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Freeing back stack index "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    iget-object v3, v7, Lhv;->j:Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, -0x1

    iput v2, v1, Lhn;->m:I

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_a
    :goto_7
    invoke-virtual {v1}, Lhn;->a()V

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_b
    if-eqz v13, :cond_c

    invoke-direct/range {p0 .. p0}, Lhv;->s()V

    :cond_c
    return-void
.end method

.method private static a(Landroid/animation/Animator;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p0, Landroid/animation/ValueAnimator;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    check-cast p0, Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getValues()[Landroid/animation/PropertyValuesHolder;

    move-result-object p0

    move v1, v0

    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_4

    const-string v3, "alpha"

    aget-object v4, p0, v1

    invoke-virtual {v4}, Landroid/animation/PropertyValuesHolder;->getPropertyName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    instance-of v1, p0, Landroid/animation/AnimatorSet;

    if-eqz v1, :cond_4

    check-cast p0, Landroid/animation/AnimatorSet;

    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->getChildAnimations()Ljava/util/ArrayList;

    move-result-object p0

    move v1, v0

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator;

    invoke-static {v3}, Lhv;->a(Landroid/animation/Animator;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return v0
.end method

.method public static b(I)I
    .locals 3

    const/16 v0, 0x2002

    const/16 v1, 0x1003

    const/16 v2, 0x1001

    if-eq p0, v2, :cond_2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move v0, v2

    return v0

    :cond_1
    move v0, v1

    :cond_2
    return v0
.end method

.method private b(Ljava/lang/String;)Lhp;
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lhp;->A:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_3

    iget-object v1, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_2

    iget-object v2, v1, Lhp;->A:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private b(Ldf;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf<",
            "Lhp;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lhv;->l:I

    if-gtz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lhv;->l:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v8, v2

    :goto_0
    if-ge v8, v1, :cond_2

    iget-object v2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lhp;

    iget v2, v9, Lhp;->b:I

    if-ge v2, v0, :cond_1

    invoke-virtual {v9}, Lhp;->B()I

    move-result v5

    invoke-virtual {v9}, Lhp;->C()I

    move-result v6

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, v9

    move v4, v0

    invoke-virtual/range {v2 .. v7}, Lhv;->a(Lhp;IIIZ)V

    iget-object v2, v9, Lhp;->J:Landroid/view/View;

    if-eqz v2, :cond_1

    iget-boolean v2, v9, Lhp;->B:Z

    if-nez v2, :cond_1

    iget-boolean v2, v9, Lhp;->O:Z

    if-eqz v2, :cond_1

    invoke-virtual {p1, v9}, Ldf;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private b(Lhp;Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1, p2}, Lhv;->b(Lhp;Landroid/content/Context;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private b(Lhp;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1, p2}, Lhv;->b(Lhp;Landroid/os/Bundle;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_7

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-direct {p0, p1, p2}, Lhv;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_5

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhn;

    iget-boolean v3, v3, Lhn;->t:Z

    if-nez v3, :cond_4

    if-eq v2, v1, :cond_2

    invoke-direct {p0, p1, p2, v2, v1}, Lhv;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_2
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_1
    if-ge v2, v0, :cond_3

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhn;

    iget-boolean v3, v3, Lhn;->t:Z

    if-nez v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1, p2, v1, v2}, Lhv;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    if-eq v2, v0, :cond_6

    invoke-direct {p0, p1, p2, v2, v0}, Lhv;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_6
    return-void

    :cond_7
    :goto_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    return-void
.end method

.method private static b(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)V"
        }
    .end annotation

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhn;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lhn;->a(I)V

    add-int/lit8 v1, p3, -0x1

    if-ne p2, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v0, v2}, Lhn;->a(Z)V

    goto :goto_2

    :cond_1
    invoke-virtual {v0, v2}, Lhn;->a(I)V

    invoke-virtual {v0}, Lhn;->b()V

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private c(I)Lhp;
    .locals 3

    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_0

    iget v2, v1, Lhp;->y:I

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_3

    iget-object v1, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_2

    iget v2, v1, Lhp;->y:I

    if-ne v2, p1, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private c(Lhp;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1, p2}, Lhv;->c(Lhp;Landroid/os/Bundle;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private c(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lhv;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lhv;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lhv;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v3, p0, Lhv;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhv$g;

    invoke-interface {v3, p1, p2}, Lhv$g;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lhv;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lhv;->m:Lht;

    iget-object p1, p1, Lht;->d:Landroid/os/Handler;

    iget-object p2, p0, Lhv;->E:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit p0

    return v2

    :cond_2
    :goto_1
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static d(Lhp;)V
    .locals 3

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hide: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Lhp;->B:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhp;->B:Z

    iget-boolean v1, p0, Lhp;->P:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lhp;->P:Z

    :cond_1
    return-void
.end method

.method private d(Lhp;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1, p2}, Lhv;->d(Lhp;Landroid/os/Bundle;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static e(Lhp;)V
    .locals 3

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "show: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Lhp;->B:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhp;->B:Z

    iget-boolean v0, p0, Lhp;->P:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lhp;->P:Z

    :cond_1
    return-void
.end method

.method private i(Lhp;)V
    .locals 6

    iget v2, p0, Lhv;->l:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lhv;->a(Lhp;IIIZ)V

    return-void
.end method

.method private j(Lhp;)V
    .locals 2

    iget-object v0, p1, Lhp;->K:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lhv;->B:Landroid/util/SparseArray;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lhv;->B:Landroid/util/SparseArray;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lhv;->B:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    :goto_0
    iget-object v0, p1, Lhp;->K:Landroid/view/View;

    iget-object v1, p0, Lhv;->B:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    iget-object v0, p0, Lhv;->B:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lhv;->B:Landroid/util/SparseArray;

    iput-object v0, p1, Lhp;->d:Landroid/util/SparseArray;

    const/4 p1, 0x0

    iput-object p1, p0, Lhv;->B:Landroid/util/SparseArray;

    :cond_2
    return-void
.end method

.method private k(Lhp;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1}, Lhv;->k(Lhp;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private l(Lhp;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1}, Lhv;->l(Lhp;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private m(Lhp;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1}, Lhv;->m(Lhp;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private n(Lhp;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1}, Lhv;->n(Lhp;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private n()Z
    .locals 5

    invoke-virtual {p0}, Lhv;->d()Z

    invoke-direct {p0}, Lhv;->p()V

    iget-object v0, p0, Lhv;->p:Lhp;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->p:Lhp;

    iget-object v0, v0, Lhp;->u:Lhv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhu;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lhv;->x:Ljava/util/ArrayList;

    iget-object v2, p0, Lhv;->y:Ljava/util/ArrayList;

    iget-object v3, p0, Lhv;->g:Ljava/util/ArrayList;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    if-gez v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v4, p0, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v1

    :goto_0
    if-eqz v4, :cond_3

    iput-boolean v1, p0, Lhv;->c:Z

    :try_start_0
    iget-object v0, p0, Lhv;->x:Ljava/util/ArrayList;

    iget-object v1, p0, Lhv;->y:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1}, Lhv;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Lhv;->q()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lhv;->q()V

    throw v0

    :cond_3
    :goto_1
    invoke-direct {p0}, Lhv;->r()V

    invoke-direct {p0}, Lhv;->u()V

    return v4
.end method

.method private o()V
    .locals 9

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lhp;

    if-eqz v4, :cond_2

    iget-boolean v2, v4, Lhp;->L:Z

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Lhv;->c:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    iput-boolean v2, p0, Lhv;->w:Z

    goto :goto_1

    :cond_1
    iput-boolean v0, v4, Lhp;->L:Z

    iget v5, p0, Lhv;->l:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Lhv;->a(Lhp;IIIZ)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private o(Lhp;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1}, Lhv;->o(Lhp;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private p()V
    .locals 2

    iget-boolean v0, p0, Lhv;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "FragmentManager is already executing transactions"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lhv;->m:Lht;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment host has been destroyed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lhv;->m:Lht;

    iget-object v1, v1, Lht;->d:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must be called from main thread of fragment host"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lhv;->x:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhv;->x:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhv;->y:Ljava/util/ArrayList;

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhv;->c:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, v1, v1}, Lhv;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Lhv;->c:Z

    return-void

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Lhv;->c:Z

    throw v1
.end method

.method private p(Lhp;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1}, Lhv;->p(Lhp;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private q()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhv;->c:Z

    iget-object v0, p0, Lhv;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lhv;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private q(Lhp;)V
    .locals 2

    iget-object v0, p0, Lhv;->o:Lhp;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->s:Lhv;

    instance-of v1, v0, Lhv;

    if-eqz v1, :cond_0

    check-cast v0, Lhv;

    invoke-direct {v0, p1}, Lhv;->q(Lhp;)V

    :cond_0
    iget-object p1, p0, Lhv;->J:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private r()V
    .locals 1

    iget-boolean v0, p0, Lhv;->w:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhv;->w:Z

    invoke-direct {p0}, Lhv;->o()V

    :cond_0
    return-void
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lhv;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lhv;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lhv;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private t()V
    .locals 10

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    move v2, v0

    move-object v3, v1

    move-object v4, v3

    move-object v5, v4

    :goto_0
    iget-object v6, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v6

    if-ge v2, v6, :cond_9

    iget-object v6, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v6, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhp;

    if-eqz v6, :cond_7

    iget-boolean v7, v6, Lhp;->D:Z

    if-eqz v7, :cond_2

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v7, v6, Lhp;->i:Lhp;

    if-eqz v7, :cond_1

    iget-object v7, v6, Lhp;->i:Lhp;

    iget v7, v7, Lhp;->f:I

    goto :goto_1

    :cond_1
    const/4 v7, -0x1

    :goto_1
    iput v7, v6, Lhp;->j:I

    sget-boolean v7, Lhv;->a:Z

    if-eqz v7, :cond_2

    const-string v7, "FragmentManager"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "retainNonConfig: keeping retained "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v7, v6, Lhp;->u:Lhv;

    if-eqz v7, :cond_3

    iget-object v7, v6, Lhp;->u:Lhv;

    invoke-direct {v7}, Lhv;->t()V

    iget-object v7, v6, Lhp;->u:Lhv;

    iget-object v7, v7, Lhv;->D:Lhw;

    goto :goto_2

    :cond_3
    iget-object v7, v6, Lhp;->v:Lhw;

    :goto_2
    if-nez v4, :cond_4

    if-eqz v7, :cond_4

    new-instance v4, Ljava/util/ArrayList;

    iget-object v8, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v8

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    move v8, v0

    :goto_3
    if-ge v8, v2, :cond_4

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    if-nez v5, :cond_6

    iget-object v7, v6, Lhp;->w:Lja;

    if-eqz v7, :cond_6

    new-instance v5, Ljava/util/ArrayList;

    iget-object v7, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    move v7, v0

    :goto_4
    if-ge v7, v2, :cond_6

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    if-eqz v5, :cond_7

    iget-object v6, v6, Lhp;->w:Lja;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_8
    move-object v3, v1

    move-object v4, v3

    move-object v5, v4

    :cond_9
    if-nez v3, :cond_a

    if-nez v4, :cond_a

    if-nez v5, :cond_a

    iput-object v1, p0, Lhv;->D:Lhw;

    return-void

    :cond_a
    new-instance v0, Lhw;

    invoke-direct {v0, v3, v4, v5}, Lhw;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iput-object v0, p0, Lhv;->D:Lhw;

    return-void
.end method

.method private u()V
    .locals 3

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lhv;->f:Landroid/util/SparseArray;

    iget-object v2, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->delete(I)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lhp;
    .locals 4

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v2, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhp;

    if-eqz v2, :cond_2

    iget-object v3, v2, Lhp;->g:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, v2, Lhp;->u:Lhv;

    if-eqz v3, :cond_1

    iget-object v2, v2, Lhp;->u:Lhv;

    invoke-virtual {v2, p1}, Lhv;->a(Ljava/lang/String;)Lhp;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method final a(I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, Lhv;->c:Z

    invoke-virtual {p0, p1, v1}, Lhv;->a(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Lhv;->c:Z

    invoke-virtual {p0}, Lhv;->d()Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Lhv;->c:Z

    throw p1
.end method

.method final a(IZ)V
    .locals 3

    iget-object v0, p0, Lhv;->m:Lht;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-nez p2, :cond_1

    iget p2, p0, Lhv;->l:I

    if-ne p1, p2, :cond_1

    return-void

    :cond_1
    iput p1, p0, Lhv;->l:I

    iget-object p1, p0, Lhv;->f:Landroid/util/SparseArray;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge v0, p1, :cond_2

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    invoke-virtual {p0, v1}, Lhv;->a(Lhp;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    move v0, p2

    :goto_1
    if-ge v0, p1, :cond_5

    iget-object v1, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_4

    iget-boolean v2, v1, Lhp;->m:Z

    if-nez v2, :cond_3

    iget-boolean v2, v1, Lhp;->C:Z

    if-eqz v2, :cond_4

    :cond_3
    iget-boolean v2, v1, Lhp;->O:Z

    if-nez v2, :cond_4

    invoke-virtual {p0, v1}, Lhv;->a(Lhp;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    invoke-direct {p0}, Lhv;->o()V

    iget-boolean p1, p0, Lhv;->r:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lhv;->m:Lht;

    if-eqz p1, :cond_6

    iget p1, p0, Lhv;->l:I

    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lhv;->m:Lht;

    invoke-virtual {p1}, Lht;->d()V

    iput-boolean p2, p0, Lhv;->r:Z

    :cond_6
    return-void
.end method

.method public final a(Landroid/content/res/Configuration;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lhp;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v2, v1, Lhp;->u:Lhv;

    if-eqz v2, :cond_0

    iget-object v1, v1, Lhp;->u:Lhv;

    invoke-virtual {v1, p1}, Lhv;->a(Landroid/content/res/Configuration;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method final a(Landroid/os/Parcelable;Lhw;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    if-nez p1, :cond_0

    return-void

    :cond_0
    move-object/from16 v2, p1

    check-cast v2, Lhx;

    iget-object v4, v2, Lhx;->a:[Lhy;

    if-nez v4, :cond_1

    return-void

    :cond_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_7

    iget-object v6, v3, Lhw;->a:Ljava/util/List;

    iget-object v7, v3, Lhw;->b:Ljava/util/List;

    iget-object v8, v3, Lhw;->c:Ljava/util/List;

    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    goto :goto_0

    :cond_2
    move v9, v5

    :goto_0
    move v10, v5

    :goto_1
    if-ge v10, v9, :cond_8

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lhp;

    sget-boolean v12, Lhv;->a:Z

    if-eqz v12, :cond_3

    const-string v12, "FragmentManager"

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "restoreAllState: re-attaching retained "

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    move v12, v5

    :goto_2
    iget-object v13, v2, Lhx;->a:[Lhy;

    array-length v13, v13

    if-ge v12, v13, :cond_4

    iget-object v13, v2, Lhx;->a:[Lhy;

    aget-object v13, v13, v12

    iget v13, v13, Lhy;->b:I

    iget v14, v11, Lhp;->f:I

    if-eq v13, v14, :cond_4

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_4
    iget-object v13, v2, Lhx;->a:[Lhy;

    array-length v13, v13

    if-ne v12, v13, :cond_5

    new-instance v13, Ljava/lang/IllegalStateException;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Could not find active fragment with index "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v15, v11, Lhp;->f:I

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v13}, Lhv;->a(Ljava/lang/RuntimeException;)V

    :cond_5
    iget-object v13, v2, Lhx;->a:[Lhy;

    aget-object v12, v13, v12

    iput-object v11, v12, Lhy;->l:Lhp;

    iput-object v4, v11, Lhp;->d:Landroid/util/SparseArray;

    iput v5, v11, Lhp;->r:I

    iput-boolean v5, v11, Lhp;->o:Z

    iput-boolean v5, v11, Lhp;->l:Z

    iput-object v4, v11, Lhp;->i:Lhp;

    iget-object v13, v12, Lhy;->k:Landroid/os/Bundle;

    if-eqz v13, :cond_6

    iget-object v13, v12, Lhy;->k:Landroid/os/Bundle;

    iget-object v14, v1, Lhv;->m:Lht;

    iget-object v14, v14, Lht;->c:Landroid/content/Context;

    invoke-virtual {v14}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v14

    invoke-virtual {v13, v14}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v13, v12, Lhy;->k:Landroid/os/Bundle;

    const-string v14, "android:view_state"

    invoke-virtual {v13, v14}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v13

    iput-object v13, v11, Lhp;->d:Landroid/util/SparseArray;

    iget-object v12, v12, Lhy;->k:Landroid/os/Bundle;

    iput-object v12, v11, Lhp;->c:Landroid/os/Bundle;

    :cond_6
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    :cond_7
    move-object v7, v4

    move-object v8, v7

    :cond_8
    new-instance v6, Landroid/util/SparseArray;

    iget-object v9, v2, Lhx;->a:[Lhy;

    array-length v9, v9

    invoke-direct {v6, v9}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v6, v1, Lhv;->f:Landroid/util/SparseArray;

    move v6, v5

    :goto_3
    iget-object v9, v2, Lhx;->a:[Lhy;

    array-length v9, v9

    if-ge v6, v9, :cond_11

    iget-object v9, v2, Lhx;->a:[Lhy;

    aget-object v9, v9, v6

    if-eqz v9, :cond_10

    if-eqz v7, :cond_9

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v11

    if-ge v6, v11, :cond_9

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lhw;

    goto :goto_4

    :cond_9
    move-object v11, v4

    :goto_4
    if-eqz v8, :cond_a

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    if-ge v6, v12, :cond_a

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lja;

    goto :goto_5

    :cond_a
    move-object v12, v4

    :goto_5
    iget-object v13, v1, Lhv;->m:Lht;

    iget-object v14, v1, Lhv;->n:Lhr;

    iget-object v15, v1, Lhv;->o:Lhp;

    iget-object v5, v9, Lhy;->l:Lhp;

    if-nez v5, :cond_e

    iget-object v5, v13, Lht;->c:Landroid/content/Context;

    iget-object v4, v9, Lhy;->i:Landroid/os/Bundle;

    if-eqz v4, :cond_b

    iget-object v4, v9, Lhy;->i:Landroid/os/Bundle;

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v10

    invoke-virtual {v4, v10}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_b
    if-eqz v14, :cond_c

    iget-object v4, v9, Lhy;->a:Ljava/lang/String;

    iget-object v10, v9, Lhy;->i:Landroid/os/Bundle;

    invoke-virtual {v14, v5, v4, v10}, Lhr;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lhp;

    move-result-object v4

    :goto_6
    iput-object v4, v9, Lhy;->l:Lhp;

    goto :goto_7

    :cond_c
    iget-object v4, v9, Lhy;->a:Ljava/lang/String;

    iget-object v10, v9, Lhy;->i:Landroid/os/Bundle;

    invoke-static {v5, v4, v10}, Lhp;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lhp;

    move-result-object v4

    goto :goto_6

    :goto_7
    iget-object v4, v9, Lhy;->k:Landroid/os/Bundle;

    if-eqz v4, :cond_d

    iget-object v4, v9, Lhy;->k:Landroid/os/Bundle;

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v4, v9, Lhy;->l:Lhp;

    iget-object v5, v9, Lhy;->k:Landroid/os/Bundle;

    iput-object v5, v4, Lhp;->c:Landroid/os/Bundle;

    :cond_d
    iget-object v4, v9, Lhy;->l:Lhp;

    iget v5, v9, Lhy;->b:I

    invoke-virtual {v4, v5, v15}, Lhp;->a(ILhp;)V

    iget-object v4, v9, Lhy;->l:Lhp;

    iget-boolean v5, v9, Lhy;->c:Z

    iput-boolean v5, v4, Lhp;->n:Z

    iget-object v4, v9, Lhy;->l:Lhp;

    const/4 v5, 0x1

    iput-boolean v5, v4, Lhp;->p:Z

    iget-object v4, v9, Lhy;->l:Lhp;

    iget v5, v9, Lhy;->d:I

    iput v5, v4, Lhp;->y:I

    iget-object v4, v9, Lhy;->l:Lhp;

    iget v5, v9, Lhy;->e:I

    iput v5, v4, Lhp;->z:I

    iget-object v4, v9, Lhy;->l:Lhp;

    iget-object v5, v9, Lhy;->f:Ljava/lang/String;

    iput-object v5, v4, Lhp;->A:Ljava/lang/String;

    iget-object v4, v9, Lhy;->l:Lhp;

    iget-boolean v5, v9, Lhy;->g:Z

    iput-boolean v5, v4, Lhp;->D:Z

    iget-object v4, v9, Lhy;->l:Lhp;

    iget-boolean v5, v9, Lhy;->h:Z

    iput-boolean v5, v4, Lhp;->C:Z

    iget-object v4, v9, Lhy;->l:Lhp;

    iget-boolean v5, v9, Lhy;->j:Z

    iput-boolean v5, v4, Lhp;->B:Z

    iget-object v4, v9, Lhy;->l:Lhp;

    iget-object v5, v13, Lht;->e:Lhv;

    iput-object v5, v4, Lhp;->s:Lhv;

    sget-boolean v4, Lhv;->a:Z

    if-eqz v4, :cond_e

    const-string v4, "FragmentManager"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "Instantiated fragment "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v9, Lhy;->l:Lhp;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    iget-object v4, v9, Lhy;->l:Lhp;

    iput-object v11, v4, Lhp;->v:Lhw;

    iget-object v4, v9, Lhy;->l:Lhp;

    iput-object v12, v4, Lhp;->w:Lja;

    iget-object v4, v9, Lhy;->l:Lhp;

    sget-boolean v5, Lhv;->a:Z

    if-eqz v5, :cond_f

    const-string v5, "FragmentManager"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "restoreAllState: active #"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ": "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v5, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_f
    iget-object v5, v1, Lhv;->f:Landroid/util/SparseArray;

    iget v10, v4, Lhp;->f:I

    invoke-virtual {v5, v10, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v4, 0x0

    iput-object v4, v9, Lhy;->l:Lhp;

    :cond_10
    add-int/lit8 v6, v6, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    goto/16 :goto_3

    :cond_11
    if-eqz v3, :cond_14

    iget-object v3, v3, Lhw;->a:Ljava/util/List;

    if-eqz v3, :cond_12

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    goto :goto_8

    :cond_12
    const/4 v5, 0x0

    :goto_8
    const/4 v4, 0x0

    :goto_9
    if-ge v4, v5, :cond_14

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhp;

    iget v7, v6, Lhp;->j:I

    if-ltz v7, :cond_13

    iget-object v7, v1, Lhv;->f:Landroid/util/SparseArray;

    iget v8, v6, Lhp;->j:I

    invoke-virtual {v7, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lhp;

    iput-object v7, v6, Lhp;->i:Lhp;

    iget-object v7, v6, Lhp;->i:Lhp;

    if-nez v7, :cond_13

    const-string v7, "FragmentManager"

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Re-attaching retained fragment "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " target no longer exists: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v6, Lhp;->j:I

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_13
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_14
    iget-object v3, v1, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, v2, Lhx;->b:[I

    if-eqz v3, :cond_18

    const/4 v3, 0x0

    :goto_a
    iget-object v4, v2, Lhx;->b:[I

    array-length v4, v4

    if-ge v3, v4, :cond_18

    iget-object v4, v1, Lhv;->f:Landroid/util/SparseArray;

    iget-object v5, v2, Lhx;->b:[I

    aget v5, v5, v3

    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhp;

    if-nez v4, :cond_15

    new-instance v5, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "No instantiated fragment for index #"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v2, Lhx;->b:[I

    aget v7, v7, v3

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v5}, Lhv;->a(Ljava/lang/RuntimeException;)V

    :cond_15
    const/4 v5, 0x1

    iput-boolean v5, v4, Lhp;->l:Z

    sget-boolean v6, Lhv;->a:Z

    if-eqz v6, :cond_16

    const-string v6, "FragmentManager"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "restoreAllState: added #"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_16
    iget-object v6, v1, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Already added!"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_17
    iget-object v6, v1, Lhv;->e:Ljava/util/ArrayList;

    monitor-enter v6

    :try_start_0
    iget-object v7, v1, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v2, v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    :cond_18
    iget-object v3, v2, Lhx;->c:[Lho;

    if-eqz v3, :cond_1b

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, v2, Lhx;->c:[Lho;

    array-length v4, v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, v1, Lhv;->g:Ljava/util/ArrayList;

    const/4 v3, 0x0

    :goto_b
    iget-object v4, v2, Lhx;->c:[Lho;

    array-length v4, v4

    if-ge v3, v4, :cond_1c

    iget-object v4, v2, Lhx;->c:[Lho;

    aget-object v4, v4, v3

    invoke-virtual {v4, v1}, Lho;->a(Lhv;)Lhn;

    move-result-object v4

    sget-boolean v5, Lhv;->a:Z

    if-eqz v5, :cond_19

    const-string v5, "FragmentManager"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "restoreAllState: back stack #"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " (index "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v7, v4, Lhn;->m:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "): "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v5, Lga;

    const-string v6, "FragmentManager"

    invoke-direct {v5, v6}, Lga;-><init>(Ljava/lang/String;)V

    new-instance v6, Ljava/io/PrintWriter;

    invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v5, "  "

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v6, v7}, Lhn;->a(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v6}, Ljava/io/PrintWriter;->close()V

    goto :goto_c

    :cond_19
    const/4 v7, 0x0

    :goto_c
    iget-object v5, v1, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v5, v4, Lhn;->m:I

    if-ltz v5, :cond_1a

    iget v5, v4, Lhn;->m:I

    invoke-direct {v1, v5, v4}, Lhv;->a(ILhn;)V

    :cond_1a
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_1b
    const/4 v3, 0x0

    iput-object v3, v1, Lhv;->g:Ljava/util/ArrayList;

    :cond_1c
    iget v3, v2, Lhx;->d:I

    if-ltz v3, :cond_1d

    iget-object v3, v1, Lhv;->f:Landroid/util/SparseArray;

    iget v4, v2, Lhx;->d:I

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhp;

    iput-object v3, v1, Lhv;->p:Lhp;

    :cond_1d
    iget v2, v2, Lhx;->e:I

    iput v2, v1, Lhv;->d:I

    return-void
.end method

.method final a(Lhn;ZZZ)V
    .locals 7

    if-eqz p2, :cond_0

    invoke-virtual {p1, p4}, Lhn;->a(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lhn;->b()V

    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    const/4 v6, 0x1

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lia;->a(Lhv;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V

    :cond_1
    if-eqz p4, :cond_2

    iget p2, p0, Lhv;->l:I

    invoke-virtual {p0, p2, v6}, Lhv;->a(IZ)V

    :cond_2
    iget-object p2, p0, Lhv;->f:Landroid/util/SparseArray;

    if-eqz p2, :cond_6

    iget-object p2, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    move-result p2

    const/4 p3, 0x0

    move v0, p3

    :goto_1
    if-ge v0, p2, :cond_6

    iget-object v1, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_5

    iget-object v2, v1, Lhp;->J:Landroid/view/View;

    if-eqz v2, :cond_5

    iget-boolean v2, v1, Lhp;->O:Z

    if-eqz v2, :cond_5

    iget v2, v1, Lhp;->z:I

    invoke-virtual {p1, v2}, Lhn;->b(I)Z

    move-result v2

    if-eqz v2, :cond_5

    iget v2, v1, Lhp;->Q:F

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_3

    iget-object v2, v1, Lhp;->J:Landroid/view/View;

    iget v4, v1, Lhp;->Q:F

    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    :cond_3
    if-eqz p4, :cond_4

    iput v3, v1, Lhp;->Q:F

    goto :goto_2

    :cond_4
    const/high16 v2, -0x40800000    # -1.0f

    iput v2, v1, Lhp;->Q:F

    iput-boolean p3, v1, Lhp;->O:Z

    :cond_5
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    return-void
.end method

.method final a(Lhp;)V
    .locals 10

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lhv;->l:I

    iget-boolean v1, p1, Lhp;->m:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lhp;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_2
    :goto_0
    move v6, v0

    invoke-virtual {p1}, Lhp;->C()I

    move-result v7

    invoke-virtual {p1}, Lhp;->D()I

    move-result v8

    const/4 v9, 0x0

    move-object v4, p0

    move-object v5, p1

    invoke-virtual/range {v4 .. v9}, Lhv;->a(Lhp;IIIZ)V

    iget-object v0, p1, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_9

    iget-object v0, p1, Lhp;->I:Landroid/view/ViewGroup;

    iget-object v1, p1, Lhp;->J:Landroid/view/View;

    const/4 v4, 0x0

    if-eqz v0, :cond_5

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v1, v2

    :goto_1
    if-ltz v1, :cond_5

    iget-object v5, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhp;

    iget-object v6, v5, Lhp;->I:Landroid/view/ViewGroup;

    if-ne v6, v0, :cond_4

    iget-object v6, v5, Lhp;->J:Landroid/view/View;

    if-eqz v6, :cond_4

    move-object v4, v5

    goto :goto_2

    :cond_4
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-eqz v4, :cond_6

    iget-object v0, v4, Lhp;->J:Landroid/view/View;

    iget-object v1, p1, Lhp;->I:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    iget-object v4, p1, Lhp;->J:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    if-ge v4, v0, :cond_6

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v4, p1, Lhp;->J:Landroid/view/View;

    invoke-virtual {v1, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_6
    iget-boolean v0, p1, Lhp;->O:Z

    if-eqz v0, :cond_9

    iget-object v0, p1, Lhp;->I:Landroid/view/ViewGroup;

    if-eqz v0, :cond_9

    iget v0, p1, Lhp;->Q:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    iget-object v0, p1, Lhp;->J:Landroid/view/View;

    iget v4, p1, Lhp;->Q:F

    invoke-virtual {v0, v4}, Landroid/view/View;->setAlpha(F)V

    :cond_7
    iput v1, p1, Lhp;->Q:F

    iput-boolean v3, p1, Lhp;->O:Z

    invoke-virtual {p1}, Lhp;->C()I

    move-result v0

    invoke-virtual {p1}, Lhp;->D()I

    move-result v1

    invoke-direct {p0, p1, v0, v2, v1}, Lhv;->a(Lhp;IZI)Lhv$c;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v1, p1, Lhp;->J:Landroid/view/View;

    invoke-static {v1, v0}, Lhv;->a(Landroid/view/View;Lhv$c;)V

    iget-object v1, v0, Lhv$c;->a:Landroid/view/animation/Animation;

    if-eqz v1, :cond_8

    iget-object v1, p1, Lhp;->J:Landroid/view/View;

    iget-object v0, v0, Lhv$c;->a:Landroid/view/animation/Animation;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_3

    :cond_8
    iget-object v1, v0, Lhv$c;->b:Landroid/animation/Animator;

    iget-object v4, p1, Lhp;->J:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    iget-object v0, v0, Lhv$c;->b:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :cond_9
    :goto_3
    iget-boolean v0, p1, Lhp;->P:Z

    if-eqz v0, :cond_11

    iget-object v0, p1, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Lhp;->C()I

    move-result v0

    iget-boolean v1, p1, Lhp;->B:Z

    xor-int/2addr v1, v2

    invoke-virtual {p1}, Lhp;->D()I

    move-result v4

    invoke-direct {p0, p1, v0, v1, v4}, Lhv;->a(Lhp;IZI)Lhv$c;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-object v1, v0, Lhv$c;->b:Landroid/animation/Animator;

    if-eqz v1, :cond_c

    iget-object v1, v0, Lhv$c;->b:Landroid/animation/Animator;

    iget-object v4, p1, Lhp;->J:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    iget-boolean v1, p1, Lhp;->B:Z

    if-eqz v1, :cond_b

    invoke-virtual {p1}, Lhp;->K()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p1, v3}, Lhp;->a(Z)V

    goto :goto_4

    :cond_a
    iget-object v1, p1, Lhp;->I:Landroid/view/ViewGroup;

    iget-object v4, p1, Lhp;->J:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    iget-object v5, v0, Lhv$c;->b:Landroid/animation/Animator;

    new-instance v6, Lhv$4;

    invoke-direct {v6, p0, v1, v4, p1}, Lhv$4;-><init>(Lhv;Landroid/view/ViewGroup;Landroid/view/View;Lhp;)V

    invoke-virtual {v5, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    goto :goto_4

    :cond_b
    iget-object v1, p1, Lhp;->J:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    iget-object v1, p1, Lhp;->J:Landroid/view/View;

    invoke-static {v1, v0}, Lhv;->a(Landroid/view/View;Lhv$c;)V

    iget-object v0, v0, Lhv$c;->b:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    goto :goto_6

    :cond_c
    if-eqz v0, :cond_d

    iget-object v1, p1, Lhp;->J:Landroid/view/View;

    invoke-static {v1, v0}, Lhv;->a(Landroid/view/View;Lhv$c;)V

    iget-object v1, p1, Lhp;->J:Landroid/view/View;

    iget-object v4, v0, Lhv$c;->a:Landroid/view/animation/Animation;

    invoke-virtual {v1, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, v0, Lhv$c;->a:Landroid/view/animation/Animation;

    invoke-virtual {v0}, Landroid/view/animation/Animation;->start()V

    :cond_d
    iget-boolean v0, p1, Lhp;->B:Z

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Lhp;->K()Z

    move-result v0

    if-nez v0, :cond_e

    const/16 v0, 0x8

    goto :goto_5

    :cond_e
    move v0, v3

    :goto_5
    iget-object v1, p1, Lhp;->J:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lhp;->K()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p1, v3}, Lhp;->a(Z)V

    :cond_f
    :goto_6
    iget-boolean v0, p1, Lhp;->l:Z

    if-eqz v0, :cond_10

    iget-boolean v0, p1, Lhp;->F:Z

    if-eqz v0, :cond_10

    iget-boolean v0, p1, Lhp;->G:Z

    if-eqz v0, :cond_10

    iput-boolean v2, p0, Lhv;->r:Z

    :cond_10
    iput-boolean v3, p1, Lhp;->P:Z

    iget-boolean p1, p1, Lhp;->B:Z

    invoke-static {}, Lhp;->f()V

    :cond_11
    return-void
.end method

.method final a(Lhp;IIIZ)V
    .locals 15

    move-object v6, p0

    move-object/from16 v7, p1

    iget-boolean v0, v7, Lhp;->l:Z

    const/4 v8, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, v7, Lhp;->C:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move/from16 v0, p2

    goto :goto_1

    :cond_1
    :goto_0
    move/from16 v0, p2

    if-le v0, v8, :cond_2

    move v0, v8

    :cond_2
    :goto_1
    iget-boolean v1, v7, Lhp;->m:Z

    if-eqz v1, :cond_4

    iget v1, v7, Lhp;->b:I

    if-le v0, v1, :cond_4

    iget v0, v7, Lhp;->b:I

    if-nez v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lhp;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v8

    goto :goto_2

    :cond_3
    iget v0, v7, Lhp;->b:I

    :cond_4
    :goto_2
    iget-boolean v1, v7, Lhp;->L:Z

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eqz v1, :cond_5

    iget v1, v7, Lhp;->b:I

    if-ge v1, v9, :cond_5

    if-le v0, v10, :cond_5

    move v11, v10

    goto :goto_3

    :cond_5
    move v11, v0

    :goto_3
    iget v0, v7, Lhp;->b:I

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-gt v0, v11, :cond_2a

    iget-boolean v0, v7, Lhp;->n:Z

    if-eqz v0, :cond_6

    iget-boolean v0, v7, Lhp;->o:Z

    if-nez v0, :cond_6

    return-void

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lhp;->G()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-virtual/range {p1 .. p1}, Lhp;->H()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_8

    :cond_7
    invoke-virtual {v7, v14}, Lhp;->a(Landroid/view/View;)V

    invoke-virtual {v7, v14}, Lhp;->a(Landroid/animation/Animator;)V

    invoke-virtual/range {p1 .. p1}, Lhp;->I()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    move-object v1, v7

    invoke-virtual/range {v0 .. v5}, Lhv;->a(Lhp;IIIZ)V

    :cond_8
    iget v0, v7, Lhp;->b:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_13

    :pswitch_0
    if-lez v11, :cond_15

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_9

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto CREATED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    if-eqz v0, :cond_c

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    iget-object v1, v6, Lhv;->m:Lht;

    iget-object v1, v1, Lht;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, v7, Lhp;->d:Landroid/util/SparseArray;

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-direct {v6, v0, v1}, Lhv;->a(Landroid/os/Bundle;Ljava/lang/String;)Lhp;

    move-result-object v0

    iput-object v0, v7, Lhp;->i:Lhp;

    iget-object v0, v7, Lhp;->i:Lhp;

    if-eqz v0, :cond_a

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    invoke-virtual {v0, v1, v13}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, v7, Lhp;->k:I

    :cond_a
    iget-object v0, v7, Lhp;->e:Ljava/lang/Boolean;

    if-eqz v0, :cond_b

    iget-object v0, v7, Lhp;->e:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, v7, Lhp;->M:Z

    iput-object v14, v7, Lhp;->e:Ljava/lang/Boolean;

    goto :goto_4

    :cond_b
    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    const-string v1, "android:user_visible_hint"

    invoke-virtual {v0, v1, v8}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v7, Lhp;->M:Z

    :goto_4
    iget-boolean v0, v7, Lhp;->M:Z

    if-nez v0, :cond_c

    iput-boolean v8, v7, Lhp;->L:Z

    if-le v11, v10, :cond_c

    move v11, v10

    :cond_c
    iget-object v0, v6, Lhv;->m:Lht;

    iput-object v0, v7, Lhp;->t:Lht;

    iget-object v0, v6, Lhv;->o:Lhp;

    iput-object v0, v7, Lhp;->x:Lhp;

    iget-object v0, v6, Lhv;->o:Lhp;

    if-eqz v0, :cond_d

    iget-object v0, v6, Lhv;->o:Lhp;

    iget-object v0, v0, Lhp;->u:Lhv;

    goto :goto_5

    :cond_d
    iget-object v0, v6, Lhv;->m:Lht;

    iget-object v0, v0, Lht;->e:Lhv;

    :goto_5
    iput-object v0, v7, Lhp;->s:Lhv;

    iget-object v0, v7, Lhp;->i:Lhp;

    if-eqz v0, :cond_f

    iget-object v0, v6, Lhv;->f:Landroid/util/SparseArray;

    iget-object v1, v7, Lhp;->i:Lhp;

    iget v1, v1, Lhp;->f:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, v7, Lhp;->i:Lhp;

    if-eq v0, v1, :cond_e

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " declared target fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v7, Lhp;->i:Lhp;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " that does not belong to this FragmentManager!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    iget-object v0, v7, Lhp;->i:Lhp;

    iget v0, v0, Lhp;->b:I

    if-gtz v0, :cond_f

    iget-object v1, v7, Lhp;->i:Lhp;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v6

    invoke-virtual/range {v0 .. v5}, Lhv;->a(Lhp;IIIZ)V

    :cond_f
    iget-object v0, v6, Lhv;->m:Lht;

    iget-object v0, v0, Lht;->c:Landroid/content/Context;

    invoke-direct {v6, v7, v0}, Lhv;->a(Lhp;Landroid/content/Context;)V

    iput-boolean v13, v7, Lhp;->H:Z

    iput-boolean v8, v7, Lhp;->H:Z

    iget-object v0, v7, Lhp;->t:Lht;

    if-nez v0, :cond_10

    move-object v0, v14

    goto :goto_6

    :cond_10
    iget-object v0, v7, Lhp;->t:Lht;

    iget-object v0, v0, Lht;->b:Landroid/app/Activity;

    :goto_6
    if-eqz v0, :cond_11

    iput-boolean v13, v7, Lhp;->H:Z

    iput-boolean v8, v7, Lhp;->H:Z

    :cond_11
    iget-boolean v0, v7, Lhp;->H:Z

    if-nez v0, :cond_12

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onAttach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    iget-object v0, v7, Lhp;->x:Lhp;

    if-eqz v0, :cond_13

    iget-object v0, v7, Lhp;->x:Lhp;

    invoke-static {}, Lhp;->k()V

    :cond_13
    iget-object v0, v6, Lhv;->m:Lht;

    iget-object v0, v0, Lht;->c:Landroid/content/Context;

    invoke-direct {v6, v7, v0}, Lhv;->b(Lhp;Landroid/content/Context;)V

    iget-boolean v0, v7, Lhp;->S:Z

    if-nez v0, :cond_14

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-direct {v6, v7, v0}, Lhv;->a(Lhp;Landroid/os/Bundle;)V

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual {v7, v0}, Lhp;->b(Landroid/os/Bundle;)V

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-direct {v6, v7, v0}, Lhv;->b(Lhp;Landroid/os/Bundle;)V

    goto :goto_7

    :cond_14
    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual {v7, v0}, Lhp;->a(Landroid/os/Bundle;)V

    iput v8, v7, Lhp;->b:I

    :goto_7
    iput-boolean v13, v7, Lhp;->E:Z

    :cond_15
    :pswitch_1
    iget-boolean v0, v7, Lhp;->n:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_18

    iget-boolean v0, v7, Lhp;->q:Z

    if-nez v0, :cond_18

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual/range {p1 .. p1}, Lhp;->i()Landroid/view/LayoutInflater;

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual/range {p1 .. p1}, Lhp;->w()V

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_17

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    iput-object v0, v7, Lhp;->K:Landroid/view/View;

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v13}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-boolean v0, v7, Lhp;->B:Z

    if-eqz v0, :cond_16

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_16
    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-static {}, Lhp;->n()V

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    iget-object v2, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-direct {v6, v7, v0, v2}, Lhv;->a(Lhp;Landroid/view/View;Landroid/os/Bundle;)V

    goto :goto_8

    :cond_17
    iput-object v14, v7, Lhp;->K:Landroid/view/View;

    :cond_18
    :goto_8
    if-le v11, v8, :cond_26

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_19

    const-string v0, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "moveto ACTIVITY_CREATED: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_19
    iget-boolean v0, v7, Lhp;->n:Z

    if-nez v0, :cond_22

    iget v0, v7, Lhp;->z:I

    if-eqz v0, :cond_1c

    iget v0, v7, Lhp;->z:I

    if-ne v0, v12, :cond_1a

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot create fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " for a container view with no id"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v0}, Lhv;->a(Ljava/lang/RuntimeException;)V

    :cond_1a
    iget-object v0, v6, Lhv;->n:Lhr;

    iget v2, v7, Lhp;->z:I

    invoke-virtual {v0, v2}, Lhr;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-nez v0, :cond_1d

    iget-boolean v2, v7, Lhp;->p:Z

    if-nez v2, :cond_1d

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lhp;->d()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_1b

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Fragment "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " not attached to a context."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1b
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v3, v7, Lhp;->z:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    :catch_0
    const-string v2, "unknown"

    :goto_9
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "No view found for id 0x"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v7, Lhp;->z:I

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") for fragment "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v3}, Lhv;->a(Ljava/lang/RuntimeException;)V

    goto :goto_a

    :cond_1c
    move-object v0, v14

    :cond_1d
    :goto_a
    iput-object v0, v7, Lhp;->I:Landroid/view/ViewGroup;

    iget-object v2, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual/range {p1 .. p1}, Lhp;->i()Landroid/view/LayoutInflater;

    iget-object v2, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual/range {p1 .. p1}, Lhp;->w()V

    iget-object v2, v7, Lhp;->J:Landroid/view/View;

    if-eqz v2, :cond_21

    iget-object v2, v7, Lhp;->J:Landroid/view/View;

    iput-object v2, v7, Lhp;->K:Landroid/view/View;

    iget-object v2, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v2, v13}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    if-eqz v0, :cond_1e

    iget-object v2, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1e
    iget-boolean v0, v7, Lhp;->B:Z

    if-eqz v0, :cond_1f

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1f
    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-static {}, Lhp;->n()V

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    iget-object v1, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-direct {v6, v7, v0, v1}, Lhv;->a(Lhp;Landroid/view/View;Landroid/os/Bundle;)V

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, v7, Lhp;->I:Landroid/view/ViewGroup;

    if-eqz v0, :cond_20

    move v0, v8

    goto :goto_b

    :cond_20
    move v0, v13

    :goto_b
    iput-boolean v0, v7, Lhp;->O:Z

    goto :goto_c

    :cond_21
    iput-object v14, v7, Lhp;->K:Landroid/view/View;

    :cond_22
    :goto_c
    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual/range {p1 .. p1}, Lhp;->x()V

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    invoke-direct {v6, v7, v0}, Lhv;->c(Lhp;Landroid/os/Bundle;)V

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_25

    iget-object v0, v7, Lhp;->c:Landroid/os/Bundle;

    iget-object v0, v7, Lhp;->d:Landroid/util/SparseArray;

    if-eqz v0, :cond_23

    iget-object v0, v7, Lhp;->K:Landroid/view/View;

    iget-object v1, v7, Lhp;->d:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    iput-object v14, v7, Lhp;->d:Landroid/util/SparseArray;

    :cond_23
    iput-boolean v13, v7, Lhp;->H:Z

    iput-boolean v8, v7, Lhp;->H:Z

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_24

    iget-object v0, v7, Lhp;->U:Liq;

    sget-object v1, Lin$a;->ON_CREATE:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    :cond_24
    iget-boolean v0, v7, Lhp;->H:Z

    if-nez v0, :cond_25

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onViewStateRestored()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    iput-object v14, v7, Lhp;->c:Landroid/os/Bundle;

    :cond_26
    :pswitch_2
    if-le v11, v10, :cond_28

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_27

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto STARTED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_27
    invoke-virtual/range {p1 .. p1}, Lhp;->y()V

    invoke-direct/range {p0 .. p1}, Lhv;->k(Lhp;)V

    :cond_28
    :pswitch_3
    if-le v11, v9, :cond_4d

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_29

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveto RESUMED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_29
    invoke-virtual/range {p1 .. p1}, Lhp;->z()V

    invoke-direct/range {p0 .. p1}, Lhv;->l(Lhp;)V

    iput-object v14, v7, Lhp;->c:Landroid/os/Bundle;

    iput-object v14, v7, Lhp;->d:Landroid/util/SparseArray;

    goto/16 :goto_13

    :cond_2a
    iget v0, v7, Lhp;->b:I

    if-le v0, v11, :cond_4d

    iget v0, v7, Lhp;->b:I

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_13

    :pswitch_4
    const/4 v0, 0x4

    if-ge v11, v0, :cond_2f

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_2b

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom RESUMED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2b
    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_2c

    iget-object v0, v7, Lhp;->U:Liq;

    sget-object v1, Lin$a;->ON_PAUSE:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    :cond_2c
    iget-object v0, v7, Lhp;->T:Liq;

    sget-object v1, Lin$a;->ON_PAUSE:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    iget-object v0, v7, Lhp;->u:Lhv;

    if-eqz v0, :cond_2d

    iget-object v0, v7, Lhp;->u:Lhv;

    invoke-virtual {v0, v9}, Lhv;->a(I)V

    :cond_2d
    iput v9, v7, Lhp;->b:I

    iput-boolean v13, v7, Lhp;->H:Z

    iput-boolean v8, v7, Lhp;->H:Z

    iget-boolean v0, v7, Lhp;->H:Z

    if-nez v0, :cond_2e

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onPause()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    invoke-direct/range {p0 .. p1}, Lhv;->m(Lhp;)V

    :cond_2f
    :pswitch_5
    if-ge v11, v9, :cond_33

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_30

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom STARTED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_30
    iget-object v0, v7, Lhp;->T:Liq;

    sget-object v1, Lin$a;->ON_STOP:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    iget-object v0, v7, Lhp;->u:Lhv;

    if-eqz v0, :cond_31

    iget-object v0, v7, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->k()V

    :cond_31
    iput v10, v7, Lhp;->b:I

    iput-boolean v13, v7, Lhp;->H:Z

    iput-boolean v8, v7, Lhp;->H:Z

    iget-boolean v0, v7, Lhp;->H:Z

    if-nez v0, :cond_32

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStop()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_32
    invoke-direct/range {p0 .. p1}, Lhv;->n(Lhp;)V

    :cond_33
    :pswitch_6
    if-ge v11, v10, :cond_3d

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_34

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom ACTIVITY_CREATED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_34
    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_35

    iget-object v0, v6, Lhv;->m:Lht;

    invoke-virtual {v0}, Lht;->b()Z

    move-result v0

    if-eqz v0, :cond_35

    iget-object v0, v7, Lhp;->d:Landroid/util/SparseArray;

    if-nez v0, :cond_35

    invoke-direct/range {p0 .. p1}, Lhv;->j(Lhp;)V

    :cond_35
    iget-object v0, v7, Lhp;->u:Lhv;

    if-eqz v0, :cond_36

    iget-object v0, v7, Lhp;->u:Lhv;

    invoke-virtual {v0, v8}, Lhv;->a(I)V

    :cond_36
    iput v8, v7, Lhp;->b:I

    iput-boolean v13, v7, Lhp;->H:Z

    iput-boolean v8, v7, Lhp;->H:Z

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_37

    iget-object v0, v7, Lhp;->U:Liq;

    sget-object v1, Lin$a;->ON_DESTROY:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    :cond_37
    iget-boolean v0, v7, Lhp;->H:Z

    if-nez v0, :cond_38

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_38
    invoke-static/range {p1 .. p1}, Ljc;->a(Lip;)Ljc;

    move-result-object v0

    invoke-virtual {v0}, Ljc;->a()V

    iput-boolean v13, v7, Lhp;->q:Z

    invoke-direct/range {p0 .. p1}, Lhv;->o(Lhp;)V

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_3c

    iget-object v0, v7, Lhp;->I:Landroid/view/ViewGroup;

    if-eqz v0, :cond_3c

    iget-object v0, v7, Lhp;->I:Landroid/view/ViewGroup;

    iget-object v1, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget v0, v6, Lhv;->l:I

    const/4 v1, 0x0

    if-lez v0, :cond_39

    iget-boolean v0, v6, Lhv;->u:Z

    if-nez v0, :cond_39

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_39

    iget v0, v7, Lhp;->Q:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_39

    move/from16 v0, p3

    move/from16 v2, p4

    invoke-direct {v6, v7, v0, v13, v2}, Lhv;->a(Lhp;IZI)Lhv$c;

    move-result-object v0

    goto :goto_d

    :cond_39
    move-object v0, v14

    :goto_d
    iput v1, v7, Lhp;->Q:F

    if-eqz v0, :cond_3b

    iget-object v1, v7, Lhp;->J:Landroid/view/View;

    iget-object v2, v7, Lhp;->I:Landroid/view/ViewGroup;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    invoke-virtual {v7, v11}, Lhp;->b(I)V

    iget-object v3, v0, Lhv$c;->a:Landroid/view/animation/Animation;

    if-eqz v3, :cond_3a

    new-instance v3, Lhv$e;

    iget-object v4, v0, Lhv$c;->a:Landroid/view/animation/Animation;

    invoke-direct {v3, v4, v2, v1}, Lhv$e;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    iget-object v4, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v7, v4}, Lhp;->a(Landroid/view/View;)V

    invoke-static {v3}, Lhv;->a(Landroid/view/animation/Animation;)Landroid/view/animation/Animation$AnimationListener;

    move-result-object v4

    new-instance v5, Lhv$2;

    invoke-direct {v5, v6, v4, v2, v7}, Lhv$2;-><init>(Lhv;Landroid/view/animation/Animation$AnimationListener;Landroid/view/ViewGroup;Lhp;)V

    invoke-virtual {v3, v5}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-static {v1, v0}, Lhv;->a(Landroid/view/View;Lhv$c;)V

    iget-object v0, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_e

    :cond_3a
    iget-object v3, v0, Lhv$c;->b:Landroid/animation/Animator;

    iget-object v4, v0, Lhv$c;->b:Landroid/animation/Animator;

    invoke-virtual {v7, v4}, Lhp;->a(Landroid/animation/Animator;)V

    new-instance v4, Lhv$3;

    invoke-direct {v4, v6, v2, v1, v7}, Lhv$3;-><init>(Lhv;Landroid/view/ViewGroup;Landroid/view/View;Lhp;)V

    invoke-virtual {v3, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v1, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v3, v1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    iget-object v1, v7, Lhp;->J:Landroid/view/View;

    invoke-static {v1, v0}, Lhv;->a(Landroid/view/View;Lhv$c;)V

    invoke-virtual {v3}, Landroid/animation/Animator;->start()V

    :cond_3b
    :goto_e
    iget-object v0, v7, Lhp;->I:Landroid/view/ViewGroup;

    iget-object v1, v7, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3c
    iput-object v14, v7, Lhp;->I:Landroid/view/ViewGroup;

    iput-object v14, v7, Lhp;->J:Landroid/view/View;

    iput-object v14, v7, Lhp;->V:Lip;

    iget-object v0, v7, Lhp;->W:Liu;

    invoke-virtual {v0, v14}, Liu;->a(Ljava/lang/Object;)V

    iput-object v14, v7, Lhp;->K:Landroid/view/View;

    iput-boolean v13, v7, Lhp;->o:Z

    :cond_3d
    :pswitch_7
    if-gtz v11, :cond_4d

    iget-boolean v0, v6, Lhv;->u:Z

    if-eqz v0, :cond_3f

    invoke-virtual/range {p1 .. p1}, Lhp;->G()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3e

    invoke-virtual/range {p1 .. p1}, Lhp;->G()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v7, v14}, Lhp;->a(Landroid/view/View;)V

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    goto :goto_f

    :cond_3e
    invoke-virtual/range {p1 .. p1}, Lhp;->H()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_3f

    invoke-virtual/range {p1 .. p1}, Lhp;->H()Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v7, v14}, Lhp;->a(Landroid/animation/Animator;)V

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_3f
    :goto_f
    invoke-virtual/range {p1 .. p1}, Lhp;->G()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_4c

    invoke-virtual/range {p1 .. p1}, Lhp;->H()Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_40

    goto/16 :goto_12

    :cond_40
    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_41

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "movefrom CREATED: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_41
    iget-boolean v0, v7, Lhp;->E:Z

    if-nez v0, :cond_46

    iget-object v0, v7, Lhp;->T:Liq;

    sget-object v1, Lin$a;->ON_DESTROY:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    iget-object v0, v7, Lhp;->u:Lhv;

    if-eqz v0, :cond_42

    iget-object v0, v7, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->l()V

    :cond_42
    iput v13, v7, Lhp;->b:I

    iput-boolean v13, v7, Lhp;->H:Z

    iput-boolean v13, v7, Lhp;->S:Z

    iput-boolean v8, v7, Lhp;->H:Z

    invoke-virtual/range {p1 .. p1}, Lhp;->e()Lhq;

    move-result-object v0

    if-eqz v0, :cond_43

    invoke-virtual {v0}, Lhq;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_43

    move v0, v8

    goto :goto_10

    :cond_43
    move v0, v13

    :goto_10
    iget-object v1, v7, Lhp;->w:Lja;

    if-eqz v1, :cond_44

    if-nez v0, :cond_44

    iget-object v0, v7, Lhp;->w:Lja;

    invoke-virtual {v0}, Lja;->a()V

    :cond_44
    iget-boolean v0, v7, Lhp;->H:Z

    if-nez v0, :cond_45

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDestroy()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_45
    iput-object v14, v7, Lhp;->u:Lhv;

    invoke-direct/range {p0 .. p1}, Lhv;->p(Lhp;)V

    goto :goto_11

    :cond_46
    iput v13, v7, Lhp;->b:I

    :goto_11
    iput-boolean v13, v7, Lhp;->H:Z

    iput-boolean v8, v7, Lhp;->H:Z

    iput-object v14, v7, Lhp;->R:Landroid/view/LayoutInflater;

    iget-boolean v0, v7, Lhp;->H:Z

    if-nez v0, :cond_47

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onDetach()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_47
    iget-object v0, v7, Lhp;->u:Lhv;

    if-eqz v0, :cond_49

    iget-boolean v0, v7, Lhp;->E:Z

    if-nez v0, :cond_48

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Child FragmentManager of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " was not  destroyed and this fragment is not retaining instance"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_48
    iget-object v0, v7, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->l()V

    iput-object v14, v7, Lhp;->u:Lhv;

    :cond_49
    invoke-direct/range {p0 .. p1}, Lhv;->q(Lhp;)V

    if-nez p5, :cond_4d

    iget-boolean v0, v7, Lhp;->E:Z

    if-nez v0, :cond_4b

    iget v0, v7, Lhp;->f:I

    if-ltz v0, :cond_4d

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_4a

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Freeing fragment index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4a
    iget-object v0, v6, Lhv;->f:Landroid/util/SparseArray;

    iget v1, v7, Lhp;->f:I

    invoke-virtual {v0, v1, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput v12, v7, Lhp;->f:I

    iput-object v14, v7, Lhp;->g:Ljava/lang/String;

    iput-boolean v13, v7, Lhp;->l:Z

    iput-boolean v13, v7, Lhp;->m:Z

    iput-boolean v13, v7, Lhp;->n:Z

    iput-boolean v13, v7, Lhp;->o:Z

    iput-boolean v13, v7, Lhp;->p:Z

    iput v13, v7, Lhp;->r:I

    iput-object v14, v7, Lhp;->s:Lhv;

    iput-object v14, v7, Lhp;->u:Lhv;

    iput-object v14, v7, Lhp;->t:Lht;

    iput v13, v7, Lhp;->y:I

    iput v13, v7, Lhp;->z:I

    iput-object v14, v7, Lhp;->A:Ljava/lang/String;

    iput-boolean v13, v7, Lhp;->B:Z

    iput-boolean v13, v7, Lhp;->C:Z

    iput-boolean v13, v7, Lhp;->E:Z

    goto :goto_13

    :cond_4b
    iput-object v14, v7, Lhp;->t:Lht;

    iput-object v14, v7, Lhp;->x:Lhp;

    iput-object v14, v7, Lhp;->s:Lhv;

    goto :goto_13

    :cond_4c
    :goto_12
    invoke-virtual {v7, v11}, Lhp;->b(I)V

    goto :goto_14

    :cond_4d
    :goto_13
    move v8, v11

    :goto_14
    iget v0, v7, Lhp;->b:I

    if-eq v0, v8, :cond_4e

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "moveToState: Fragment state for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not updated inline; expected state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v7, Lhp;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput v8, v7, Lhp;->b:I

    :cond_4e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public final a(Lhp;Z)V
    .locals 3

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0, p1}, Lhv;->b(Lhp;)V

    iget-boolean v0, p1, Lhp;->C:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment already added: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    iput-boolean v0, p1, Lhp;->l:Z

    const/4 v1, 0x0

    iput-boolean v1, p1, Lhp;->m:Z

    iget-object v2, p1, Lhp;->J:Landroid/view/View;

    if-nez v2, :cond_2

    iput-boolean v1, p1, Lhp;->P:Z

    :cond_2
    iget-boolean v1, p1, Lhp;->F:Z

    if-eqz v1, :cond_3

    iget-boolean v1, p1, Lhp;->G:Z

    if-eqz v1, :cond_3

    iput-boolean v0, p0, Lhv;->r:Z

    :cond_3
    if-eqz p2, :cond_4

    invoke-direct {p0, p1}, Lhv;->i(Lhp;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_4
    return-void
.end method

.method public final a(Lht;Lhr;Lhp;)V
    .locals 1

    iget-object v0, p0, Lhv;->m:Lht;

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iput-object p1, p0, Lhv;->m:Lht;

    iput-object p2, p0, Lhv;->n:Lhr;

    iput-object p3, p0, Lhv;->o:Lhp;

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lhv;->f:Landroid/util/SparseArray;

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    iget-object v1, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-lez v1, :cond_e

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "Active Fragments in "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, ":"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_e

    iget-object v4, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhp;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "  #"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v5, ": "

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    if-eqz v4, :cond_d

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mFragmentId=#"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v4, Lhp;->y:I

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, " mContainerId=#"

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v4, Lhp;->z:I

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, " mTag="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->A:Ljava/lang/String;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mState="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v4, Lhp;->b:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    const-string v5, " mIndex="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v4, Lhp;->f:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    const-string v5, " mWho="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->g:Ljava/lang/String;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, " mBackStackNesting="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v4, Lhp;->r:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mAdded="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->l:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    const-string v5, " mRemoving="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->m:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    const-string v5, " mFromLayout="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->n:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    const-string v5, " mInLayout="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->o:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mHidden="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->B:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    const-string v5, " mDetached="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->C:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    const-string v5, " mMenuVisible="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->G:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    const-string v5, " mHasMenu="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->F:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mRetainInstance="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->D:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    const-string v5, " mRetaining="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->E:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    const-string v5, " mUserVisibleHint="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v5, v4, Lhp;->M:Z

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v5, v4, Lhp;->s:Lhv;

    if-eqz v5, :cond_0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mFragmentManager="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->s:Lhv;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v5, v4, Lhp;->t:Lht;

    if-eqz v5, :cond_1

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mHost="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->t:Lht;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v5, v4, Lhp;->x:Lhp;

    if-eqz v5, :cond_2

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mParentFragment="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->x:Lhp;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v5, v4, Lhp;->h:Landroid/os/Bundle;

    if-eqz v5, :cond_3

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mArguments="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->h:Landroid/os/Bundle;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v5, v4, Lhp;->c:Landroid/os/Bundle;

    if-eqz v5, :cond_4

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mSavedFragmentState="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v5, v4, Lhp;->d:Landroid/util/SparseArray;

    if-eqz v5, :cond_5

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mSavedViewState="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->d:Landroid/util/SparseArray;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v5, v4, Lhp;->i:Lhp;

    if-eqz v5, :cond_6

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mTarget="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->i:Lhp;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v5, " mTargetRequestCode="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v5, v4, Lhp;->k:I

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    :cond_6
    invoke-virtual {v4}, Lhp;->B()I

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mNextAnim="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v4}, Lhp;->B()I

    move-result v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    :cond_7
    iget-object v5, v4, Lhp;->I:Landroid/view/ViewGroup;

    if-eqz v5, :cond_8

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mContainer="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->I:Landroid/view/ViewGroup;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_8
    iget-object v5, v4, Lhp;->J:Landroid/view/View;

    if-eqz v5, :cond_9

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mView="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->J:Landroid/view/View;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_9
    iget-object v5, v4, Lhp;->K:Landroid/view/View;

    if-eqz v5, :cond_a

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mInnerView="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v5, v4, Lhp;->J:Landroid/view/View;

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {v4}, Lhp;->G()Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mAnimatingAway="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v4}, Lhp;->G()Landroid/view/View;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "mStateAfterAnimating="

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v4}, Lhp;->I()I

    move-result v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    :cond_b
    invoke-virtual {v4}, Lhp;->d()Landroid/content/Context;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-static {v4}, Ljc;->a(Lip;)Ljc;

    move-result-object v5

    invoke-virtual {v5, v0, p3}, Ljc;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_c
    iget-object v5, v4, Lhp;->u:Lhv;

    if-eqz v5, :cond_d

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Child "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v4, Lhp;->u:Lhv;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ":"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v4, v4, Lhp;->u:Lhv;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "  "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, p2, p3, p4}, Lhv;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_d
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_e
    iget-object p2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_f

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Added Fragments:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v2

    :goto_1
    if-ge p4, p2, :cond_f

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Lhp;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_f
    iget-object p2, p0, Lhv;->h:Ljava/util/ArrayList;

    if-eqz p2, :cond_10

    iget-object p2, p0, Lhv;->h:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_10

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Fragments Created Menus:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v2

    :goto_2
    if-ge p4, p2, :cond_10

    iget-object v1, p0, Lhv;->h:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Lhp;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_2

    :cond_10
    iget-object p2, p0, Lhv;->g:Ljava/util/ArrayList;

    if-eqz p2, :cond_11

    iget-object p2, p0, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_11

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Back Stack:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v2

    :goto_3
    if-ge p4, p2, :cond_11

    iget-object v1, p0, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhn;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Lhn;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v1, v0, p3}, Lhn;->a(Ljava/lang/String;Ljava/io/PrintWriter;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_3

    :cond_11
    monitor-enter p0

    :try_start_0
    iget-object p2, p0, Lhv;->i:Ljava/util/ArrayList;

    if-eqz p2, :cond_12

    iget-object p2, p0, Lhv;->i:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_12

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Back Stack Indices:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v2

    :goto_4
    if-ge p4, p2, :cond_12

    iget-object v0, p0, Lhv;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhn;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "  #"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v1, ": "

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_4

    :cond_12
    iget-object p2, p0, Lhv;->j:Ljava/util/ArrayList;

    if-eqz p2, :cond_13

    iget-object p2, p0, Lhv;->j:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_13

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mAvailBackStackIndices: "

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Lhv;->j:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lhv;->b:Ljava/util/ArrayList;

    if-eqz p2, :cond_14

    iget-object p2, p0, Lhv;->b:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_14

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Pending Actions:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_5
    if-ge v2, p2, :cond_14

    iget-object p4, p0, Lhv;->b:Ljava/util/ArrayList;

    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lhv$g;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "  #"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, ": "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_14
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Lhv;->m:Lht;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Lhv;->n:Lhr;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, Lhv;->o:Lhp;

    if-eqz p2, :cond_15

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Lhv;->o:Lhp;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_15
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget p2, p0, Lhv;->l:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Lhv;->s:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Lhv;->t:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Lhv;->u:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean p2, p0, Lhv;->r:Z

    if-eqz p2, :cond_16

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, Lhv;->r:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    :cond_16
    iget-object p2, p0, Lhv;->v:Ljava/lang/String;

    if-eqz p2, :cond_17

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNoTransactionsBecause="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p1, p0, Lhv;->v:Ljava/lang/String;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_17
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Z)V
    .locals 3

    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lhp;->u:Lhv;

    if-eqz v2, :cond_0

    iget-object v1, v1, Lhp;->u:Lhv;

    invoke-virtual {v1, p1}, Lhv;->a(Z)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a()Z
    .locals 3

    invoke-virtual {p0}, Lhv;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can not perform this action after onSaveInstanceState"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lhv;->v:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can not perform this action inside of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lhv;->v:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-direct {p0}, Lhv;->n()Z

    move-result v0

    return v0
.end method

.method public final a(Landroid/view/Menu;)Z
    .locals 7

    iget v0, p0, Lhv;->l:I

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    move v0, v1

    move v2, v0

    :goto_0
    iget-object v3, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    iget-object v3, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhp;

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    iget-boolean v5, v3, Lhp;->B:Z

    if-nez v5, :cond_3

    iget-boolean v5, v3, Lhp;->F:Z

    if-eqz v5, :cond_1

    iget-boolean v5, v3, Lhp;->G:Z

    if-eqz v5, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    iget-object v6, v3, Lhp;->u:Lhv;

    if-eqz v6, :cond_2

    iget-object v3, v3, Lhp;->u:Lhv;

    invoke-virtual {v3, p1}, Lhv;->a(Landroid/view/Menu;)Z

    move-result v3

    or-int/2addr v3, v5

    goto :goto_2

    :cond_2
    move v3, v5

    goto :goto_2

    :cond_3
    move v3, v1

    :goto_2
    if-eqz v3, :cond_4

    move v2, v4

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    return v2
.end method

.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 8

    iget v0, p0, Lhv;->l:I

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    move-object v2, v0

    move v0, v1

    move v3, v0

    :goto_0
    iget-object v4, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v0, v4, :cond_6

    iget-object v4, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhp;

    const/4 v5, 0x1

    if-eqz v4, :cond_5

    iget-boolean v6, v4, Lhp;->B:Z

    if-nez v6, :cond_2

    iget-boolean v6, v4, Lhp;->F:Z

    if-eqz v6, :cond_1

    iget-boolean v6, v4, Lhp;->G:Z

    if-eqz v6, :cond_1

    move v6, v5

    goto :goto_1

    :cond_1
    move v6, v1

    :goto_1
    iget-object v7, v4, Lhp;->u:Lhv;

    if-eqz v7, :cond_3

    iget-object v7, v4, Lhp;->u:Lhv;

    invoke-virtual {v7, p1, p2}, Lhv;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v7

    or-int/2addr v6, v7

    goto :goto_2

    :cond_2
    move v6, v1

    :cond_3
    :goto_2
    if-eqz v6, :cond_5

    if-nez v2, :cond_4

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v5

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    iget-object p1, p0, Lhv;->h:Ljava/util/ArrayList;

    if-eqz p1, :cond_9

    :goto_3
    iget-object p1, p0, Lhv;->h:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v1, p1, :cond_9

    iget-object p1, p0, Lhv;->h:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhp;

    if-eqz v2, :cond_7

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :cond_7
    invoke-static {}, Lhp;->o()V

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_9
    iput-object v2, p0, Lhv;->h:Ljava/util/ArrayList;

    return v3
.end method

.method public final a(Landroid/view/MenuItem;)Z
    .locals 5

    iget v0, p0, Lhv;->l:I

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhp;

    if-eqz v2, :cond_2

    iget-boolean v3, v2, Lhp;->B:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1

    iget-object v3, v2, Lhp;->u:Lhv;

    if-eqz v3, :cond_1

    iget-object v2, v2, Lhp;->u:Lhv;

    invoke-virtual {v2, p1}, Lhv;->a(Landroid/view/MenuItem;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    return v4

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public final b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b(Landroid/view/Menu;)V
    .locals 3

    iget v0, p0, Lhv;->l:I

    if-gtz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Lhp;->B:Z

    if-nez v2, :cond_1

    iget-object v2, v1, Lhp;->u:Lhv;

    if-eqz v2, :cond_1

    iget-object v1, v1, Lhp;->u:Lhv;

    invoke-virtual {v1, p1}, Lhv;->b(Landroid/view/Menu;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method final b(Lhp;)V
    .locals 3

    iget v0, p1, Lhp;->f:I

    if-ltz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lhv;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lhv;->d:I

    iget-object v1, p0, Lhv;->o:Lhp;

    invoke-virtual {p1, v0, v1}, Lhp;->a(ILhp;)V

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    :cond_1
    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    iget v1, p1, Lhp;->f:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_2

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Allocated fragment index "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method

.method public final b(Z)V
    .locals 3

    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lhp;->u:Lhv;

    if-eqz v2, :cond_0

    iget-object v1, v1, Lhp;->u:Lhv;

    invoke-virtual {v1, p1}, Lhv;->b(Z)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b(Landroid/view/MenuItem;)Z
    .locals 5

    iget v0, p0, Lhv;->l:I

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhp;

    if-eqz v2, :cond_2

    iget-boolean v3, v2, Lhp;->B:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1

    iget-object v3, v2, Lhp;->u:Lhv;

    if-eqz v3, :cond_1

    iget-object v2, v2, Lhp;->u:Lhv;

    invoke-virtual {v2, p1}, Lhv;->b(Landroid/view/MenuItem;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    return v4

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public final c(Lhp;)V
    .locals 3

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "remove: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " nesting="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Lhp;->r:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p1}, Lhp;->b()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-boolean v2, p1, Lhp;->C:Z

    if-eqz v2, :cond_1

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v0, p1, Lhp;->F:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lhp;->G:Z

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Lhv;->r:Z

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p1, Lhp;->l:Z

    iput-boolean v1, p1, Lhp;->m:Z

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lhv;->s:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lhv;->t:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final d()Z
    .locals 4

    invoke-direct {p0}, Lhv;->p()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lhv;->x:Ljava/util/ArrayList;

    iget-object v3, p0, Lhv;->y:Ljava/util/ArrayList;

    invoke-direct {p0, v2, v3}, Lhv;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-boolean v0, p0, Lhv;->c:Z

    :try_start_0
    iget-object v1, p0, Lhv;->x:Ljava/util/ArrayList;

    iget-object v2, p0, Lhv;->y:Ljava/util/ArrayList;

    invoke-direct {p0, v1, v2}, Lhv;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Lhv;->q()V

    move v1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lhv;->q()V

    throw v0

    :cond_0
    invoke-direct {p0}, Lhv;->r()V

    invoke-direct {p0}, Lhv;->u()V

    return v1
.end method

.method final e()Landroid/os/Parcelable;
    .locals 14

    iget-object v0, p0, Lhv;->C:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :goto_0
    iget-object v0, p0, Lhv;->C:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhv;->C:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhv$h;

    invoke-virtual {v0}, Lhv$h;->c()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    :goto_1
    move v2, v1

    :goto_2
    const/4 v3, 0x0

    if-ge v2, v0, :cond_5

    iget-object v4, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lhp;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lhp;->G()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v6}, Lhp;->I()I

    move-result v7

    invoke-virtual {v6}, Lhp;->G()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Landroid/view/animation/Animation;->cancel()V

    invoke-virtual {v4}, Landroid/view/View;->clearAnimation()V

    :cond_2
    invoke-virtual {v6, v3}, Lhp;->a(Landroid/view/View;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, p0

    invoke-virtual/range {v5 .. v10}, Lhv;->a(Lhp;IIIZ)V

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lhp;->H()Landroid/animation/Animator;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v6}, Lhp;->H()Landroid/animation/Animator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/animation/Animator;->end()V

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lhv;->d()Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhv;->s:Z

    iput-object v3, p0, Lhv;->D:Lhw;

    iget-object v2, p0, Lhv;->f:Landroid/util/SparseArray;

    if-eqz v2, :cond_20

    iget-object v2, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-gtz v2, :cond_6

    return-object v3

    :cond_6
    iget-object v2, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    new-array v4, v2, [Lhy;

    move v5, v1

    move v6, v5

    :goto_4
    if-ge v5, v2, :cond_16

    iget-object v7, p0, Lhv;->f:Landroid/util/SparseArray;

    invoke-virtual {v7, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lhp;

    if-eqz v7, :cond_15

    iget v6, v7, Lhp;->f:I

    if-gez v6, :cond_7

    new-instance v6, Ljava/lang/IllegalStateException;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Failure saving state: active "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " has cleared index: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v9, v7, Lhp;->f:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v6}, Lhv;->a(Ljava/lang/RuntimeException;)V

    :cond_7
    new-instance v6, Lhy;

    invoke-direct {v6, v7}, Lhy;-><init>(Lhp;)V

    aput-object v6, v4, v5

    iget v8, v7, Lhp;->b:I

    if-lez v8, :cond_12

    iget-object v8, v6, Lhy;->k:Landroid/os/Bundle;

    if-nez v8, :cond_12

    iget-object v8, p0, Lhv;->A:Landroid/os/Bundle;

    if-nez v8, :cond_8

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    iput-object v8, p0, Lhv;->A:Landroid/os/Bundle;

    :cond_8
    iget-object v8, p0, Lhv;->A:Landroid/os/Bundle;

    invoke-virtual {v7, v8}, Lhp;->c(Landroid/os/Bundle;)V

    iget-object v8, p0, Lhv;->A:Landroid/os/Bundle;

    invoke-direct {p0, v7, v8}, Lhv;->d(Lhp;Landroid/os/Bundle;)V

    iget-object v8, p0, Lhv;->A:Landroid/os/Bundle;

    invoke-virtual {v8}, Landroid/os/Bundle;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_9

    iget-object v8, p0, Lhv;->A:Landroid/os/Bundle;

    iput-object v3, p0, Lhv;->A:Landroid/os/Bundle;

    goto :goto_5

    :cond_9
    move-object v8, v3

    :goto_5
    iget-object v9, v7, Lhp;->J:Landroid/view/View;

    if-eqz v9, :cond_a

    invoke-direct {p0, v7}, Lhv;->j(Lhp;)V

    :cond_a
    iget-object v9, v7, Lhp;->d:Landroid/util/SparseArray;

    if-eqz v9, :cond_c

    if-nez v8, :cond_b

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    :cond_b
    const-string v9, "android:view_state"

    iget-object v10, v7, Lhp;->d:Landroid/util/SparseArray;

    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_c
    iget-boolean v9, v7, Lhp;->M:Z

    if-nez v9, :cond_e

    if-nez v8, :cond_d

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    :cond_d
    const-string v9, "android:user_visible_hint"

    iget-boolean v10, v7, Lhp;->M:Z

    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_e
    iput-object v8, v6, Lhy;->k:Landroid/os/Bundle;

    iget-object v8, v7, Lhp;->i:Lhp;

    if-eqz v8, :cond_13

    iget-object v8, v7, Lhp;->i:Lhp;

    iget v8, v8, Lhp;->f:I

    if-gez v8, :cond_f

    new-instance v8, Ljava/lang/IllegalStateException;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Failure saving state: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " has target not in fragment manager: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v7, Lhp;->i:Lhp;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v8}, Lhv;->a(Ljava/lang/RuntimeException;)V

    :cond_f
    iget-object v8, v6, Lhy;->k:Landroid/os/Bundle;

    if-nez v8, :cond_10

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    iput-object v8, v6, Lhy;->k:Landroid/os/Bundle;

    :cond_10
    iget-object v8, v6, Lhy;->k:Landroid/os/Bundle;

    const-string v9, "android:target_state"

    iget-object v10, v7, Lhp;->i:Lhp;

    iget v11, v10, Lhp;->f:I

    if-gez v11, :cond_11

    new-instance v11, Ljava/lang/IllegalStateException;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Fragment "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, " is not currently in the FragmentManager"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v11}, Lhv;->a(Ljava/lang/RuntimeException;)V

    :cond_11
    iget v10, v10, Lhp;->f:I

    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v8, v7, Lhp;->k:I

    if-eqz v8, :cond_13

    iget-object v8, v6, Lhy;->k:Landroid/os/Bundle;

    const-string v9, "android:target_req_state"

    iget v10, v7, Lhp;->k:I

    invoke-virtual {v8, v9, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_6

    :cond_12
    iget-object v8, v7, Lhp;->c:Landroid/os/Bundle;

    iput-object v8, v6, Lhy;->k:Landroid/os/Bundle;

    :cond_13
    :goto_6
    sget-boolean v8, Lhv;->a:Z

    if-eqz v8, :cond_14

    const-string v8, "FragmentManager"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Saved state of "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ": "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v6, Lhy;->k:Landroid/os/Bundle;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v8, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_14
    move v6, v0

    :cond_15
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_4

    :cond_16
    if-nez v6, :cond_18

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_17

    const-string v0, "FragmentManager"

    const-string v1, "saveAllState: no fragments!"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_17
    return-object v3

    :cond_18
    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1b

    new-array v2, v0, [I

    move v5, v1

    :goto_7
    if-ge v5, v0, :cond_1c

    iget-object v6, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhp;

    iget v6, v6, Lhp;->f:I

    aput v6, v2, v5

    aget v6, v2, v5

    if-gez v6, :cond_19

    new-instance v6, Ljava/lang/IllegalStateException;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Failure saving state: active "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " has cleared index: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v8, v2, v5

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v6}, Lhv;->a(Ljava/lang/RuntimeException;)V

    :cond_19
    sget-boolean v6, Lhv;->a:Z

    if-eqz v6, :cond_1a

    const-string v6, "FragmentManager"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "saveAllState: adding fragment #"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1a
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_1b
    move-object v2, v3

    :cond_1c
    iget-object v0, p0, Lhv;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_1e

    iget-object v0, p0, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1e

    new-array v3, v0, [Lho;

    :goto_8
    if-ge v1, v0, :cond_1e

    new-instance v5, Lho;

    iget-object v6, p0, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lhn;

    invoke-direct {v5, v6}, Lho;-><init>(Lhn;)V

    aput-object v5, v3, v1

    sget-boolean v5, Lhv;->a:Z

    if-eqz v5, :cond_1d

    const-string v5, "FragmentManager"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "saveAllState: adding back stack #"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ": "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lhv;->g:Ljava/util/ArrayList;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1d
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_1e
    new-instance v0, Lhx;

    invoke-direct {v0}, Lhx;-><init>()V

    iput-object v4, v0, Lhx;->a:[Lhy;

    iput-object v2, v0, Lhx;->b:[I

    iput-object v3, v0, Lhx;->c:[Lho;

    iget-object v1, p0, Lhv;->p:Lhp;

    if-eqz v1, :cond_1f

    iget-object v1, p0, Lhv;->p:Lhp;

    iget v1, v1, Lhp;->f:I

    iput v1, v0, Lhx;->d:I

    :cond_1f
    iget v1, p0, Lhv;->d:I

    iput v1, v0, Lhx;->e:I

    invoke-direct {p0}, Lhv;->t()V

    return-object v0

    :cond_20
    return-object v3
.end method

.method public final f()V
    .locals 4

    const/4 v0, 0x0

    iput-object v0, p0, Lhv;->D:Lhw;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhv;->s:Z

    iput-boolean v0, p0, Lhv;->t:Z

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    iget-object v2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhp;

    if-eqz v2, :cond_0

    iget-object v3, v2, Lhp;->u:Lhv;

    if-eqz v3, :cond_0

    iget-object v2, v2, Lhp;->u:Lhv;

    invoke-virtual {v2}, Lhv;->f()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final f(Lhp;)V
    .locals 4

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "detach: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Lhp;->C:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p1, Lhp;->C:Z

    iget-boolean v1, p1, Lhp;->l:Z

    if-eqz v1, :cond_3

    sget-boolean v1, Lhv;->a:Z

    if-eqz v1, :cond_1

    const-string v1, "FragmentManager"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "remove from detach: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p1, Lhp;->F:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p1, Lhp;->G:Z

    if-eqz v1, :cond_2

    iput-boolean v0, p0, Lhv;->r:Z

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p1, Lhp;->l:Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhv;->s:Z

    iput-boolean v0, p0, Lhv;->t:Z

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lhv;->a(I)V

    return-void
.end method

.method public final g(Lhp;)V
    .locals 3

    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "attach: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Lhp;->C:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iput-boolean v0, p1, Lhp;->C:Z

    iget-boolean v0, p1, Lhp;->l:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment already added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-boolean v0, Lhv;->a:Z

    if-eqz v0, :cond_2

    const-string v0, "FragmentManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add from attach: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v0, p0, Lhv;->e:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    iput-boolean v0, p1, Lhp;->l:Z

    iget-boolean v1, p1, Lhp;->F:Z

    if-eqz v1, :cond_3

    iget-boolean p1, p1, Lhp;->G:Z

    if-eqz p1, :cond_3

    iput-boolean v0, p0, Lhv;->r:Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhv;->s:Z

    iput-boolean v0, p0, Lhv;->t:Z

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lhv;->a(I)V

    return-void
.end method

.method public final h(Lhp;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, Lhv;->f:Landroid/util/SparseArray;

    iget v1, p1, Lhp;->f:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    iget-object v0, p1, Lhp;->t:Lht;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lhp;->s:Lhv;

    if-eq v0, p0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p1, p0, Lhv;->p:Lhp;

    return-void
.end method

.method public final i()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhv;->s:Z

    iput-boolean v0, p0, Lhv;->t:Z

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lhv;->a(I)V

    return-void
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhv;->s:Z

    iput-boolean v0, p0, Lhv;->t:Z

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lhv;->a(I)V

    return-void
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhv;->t:Z

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lhv;->a(I)V

    return-void
.end method

.method public final l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhv;->u:Z

    invoke-virtual {p0}, Lhv;->d()Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhv;->a(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lhv;->m:Lht;

    iput-object v0, p0, Lhv;->n:Lhr;

    iput-object v0, p0, Lhv;->o:Lhp;

    return-void
.end method

.method public final m()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lhv;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhp;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhp;->onLowMemory()V

    iget-object v2, v1, Lhp;->u:Lhv;

    if-eqz v2, :cond_0

    iget-object v1, v1, Lhp;->u:Lhv;

    invoke-virtual {v1}, Lhv;->m()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 13

    move-object v6, p0

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "fragment"

    move-object v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    :cond_0
    const-string v2, "class"

    invoke-interface {v1, v3, v2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lhv$f;->a:[I

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v2, :cond_1

    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_1
    move-object v7, v2

    const/4 v2, -0x1

    const/4 v8, 0x1

    invoke-virtual {v4, v8, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    const/4 v10, 0x2

    invoke-virtual {v4, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v4, v6, Lhv;->m:Lht;

    iget-object v4, v4, Lht;->c:Landroid/content/Context;

    invoke-static {v4, v7}, Lhp;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    return-object v3

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v5

    :cond_3
    if-ne v5, v2, :cond_4

    if-ne v9, v2, :cond_4

    if-nez v10, :cond_4

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p4 .. p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-eq v9, v2, :cond_5

    invoke-direct {v6, v9}, Lhv;->c(I)Lhp;

    move-result-object v4

    goto :goto_0

    :cond_5
    move-object v4, v3

    :goto_0
    if-nez v4, :cond_6

    if-eqz v10, :cond_6

    invoke-direct {v6, v10}, Lhv;->b(Ljava/lang/String;)Lhp;

    move-result-object v4

    :cond_6
    if-nez v4, :cond_7

    if-eq v5, v2, :cond_7

    invoke-direct {v6, v5}, Lhv;->c(I)Lhp;

    move-result-object v4

    :cond_7
    sget-boolean v2, Lhv;->a:Z

    if-eqz v2, :cond_8

    const-string v2, "FragmentManager"

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "onCreateView: id=0x"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " fname="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " existing="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v2, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    if-nez v4, :cond_a

    iget-object v1, v6, Lhv;->n:Lhr;

    invoke-virtual {v1, v0, v7, v3}, Lhr;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lhp;

    move-result-object v0

    iput-boolean v8, v0, Lhp;->n:Z

    if-eqz v9, :cond_9

    move v1, v9

    goto :goto_1

    :cond_9
    move v1, v5

    :goto_1
    iput v1, v0, Lhp;->y:I

    iput v5, v0, Lhp;->z:I

    iput-object v10, v0, Lhp;->A:Ljava/lang/String;

    iput-boolean v8, v0, Lhp;->o:Z

    iput-object v6, v0, Lhp;->s:Lhv;

    iget-object v1, v6, Lhv;->m:Lht;

    iput-object v1, v0, Lhp;->t:Lht;

    iget-object v1, v0, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual {v0}, Lhp;->j()V

    invoke-virtual {v6, v0, v8}, Lhv;->a(Lhp;Z)V

    move-object v8, v0

    goto :goto_2

    :cond_a
    iget-boolean v0, v4, Lhp;->o:Z

    if-eqz v0, :cond_b

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p4 .. p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": Duplicate id 0x"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tag "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", or parent id 0x"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " with another fragment for "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    iput-boolean v8, v4, Lhp;->o:Z

    iget-object v0, v6, Lhv;->m:Lht;

    iput-object v0, v4, Lhp;->t:Lht;

    iget-boolean v0, v4, Lhp;->E:Z

    if-nez v0, :cond_c

    iget-object v0, v4, Lhp;->c:Landroid/os/Bundle;

    invoke-virtual {v4}, Lhp;->j()V

    :cond_c
    move-object v8, v4

    :goto_2
    iget v0, v6, Lhv;->l:I

    if-gtz v0, :cond_d

    iget-boolean v0, v8, Lhp;->n:Z

    if-eqz v0, :cond_d

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, v8

    invoke-virtual/range {v0 .. v5}, Lhv;->a(Lhp;IIIZ)V

    goto :goto_3

    :cond_d
    invoke-direct {v6, v8}, Lhv;->i(Lhp;)V

    :goto_3
    iget-object v0, v8, Lhp;->J:Landroid/view/View;

    if-nez v0, :cond_e

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " did not create a view."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    if-eqz v9, :cond_f

    iget-object v0, v8, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setId(I)V

    :cond_f
    iget-object v0, v8, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_10

    iget-object v0, v8, Lhp;->J:Landroid/view/View;

    invoke-virtual {v0, v10}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_10
    iget-object v0, v8, Lhp;->J:Landroid/view/View;

    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lhv;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhv;->o:Lhp;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lhv;->o:Lhp;

    :goto_0
    invoke-static {v1, v0}, Lfz;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lhv;->m:Lht;

    goto :goto_0

    :goto_1
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
