.class public Lhp;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Lip;
.implements Ljb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhp$a;,
        Lhp$c;,
        Lhp$b;
    }
.end annotation


# static fields
.field private static final X:Ldk;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldk<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field static final a:Ljava/lang/Object;


# instance fields
.field A:Ljava/lang/String;

.field B:Z

.field C:Z

.field D:Z

.field E:Z

.field F:Z

.field G:Z

.field H:Z

.field I:Landroid/view/ViewGroup;

.field J:Landroid/view/View;

.field K:Landroid/view/View;

.field L:Z

.field M:Z

.field N:Lhp$a;

.field O:Z

.field P:Z

.field Q:F

.field R:Landroid/view/LayoutInflater;

.field S:Z

.field T:Liq;

.field U:Liq;

.field V:Lip;

.field W:Liu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Liu<",
            "Lip;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:Landroid/os/Bundle;

.field d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field e:Ljava/lang/Boolean;

.field f:I

.field g:Ljava/lang/String;

.field h:Landroid/os/Bundle;

.field i:Lhp;

.field j:I

.field k:I

.field l:Z

.field m:Z

.field n:Z

.field o:Z

.field p:Z

.field q:Z

.field r:I

.field s:Lhv;

.field t:Lht;

.field u:Lhv;

.field v:Lhw;

.field w:Lja;

.field x:Lhp;

.field y:I

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldk;

    invoke-direct {v0}, Ldk;-><init>()V

    sput-object v0, Lhp;->X:Ldk;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhp;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lhp;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lhp;->f:I

    iput v0, p0, Lhp;->j:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhp;->G:Z

    iput-boolean v0, p0, Lhp;->M:Z

    new-instance v0, Liq;

    invoke-direct {v0, p0}, Liq;-><init>(Lip;)V

    iput-object v0, p0, Lhp;->T:Liq;

    new-instance v0, Liu;

    invoke-direct {v0}, Liu;-><init>()V

    iput-object v0, p0, Lhp;->W:Liu;

    return-void
.end method

.method private L()V
    .locals 3

    iget-object v0, p0, Lhp;->t:Lht;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment has not been attached yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lhv;

    invoke-direct {v0}, Lhv;-><init>()V

    iput-object v0, p0, Lhp;->u:Lhv;

    iget-object v0, p0, Lhp;->u:Lhv;

    iget-object v1, p0, Lhp;->t:Lht;

    new-instance v2, Lhp$2;

    invoke-direct {v2, p0}, Lhp$2;-><init>(Lhp;)V

    invoke-virtual {v0, v1, v2, p0}, Lhv;->a(Lht;Lhr;Lhp;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lhp;
    .locals 2

    :try_start_0
    sget-object v0, Lhp;->X:Ldk;

    invoke-virtual {v0, p1}, Ldk;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object p0, Lhp;->X:Ldk;

    invoke-virtual {p0, p1, v0}, Ldk;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p0, 0x0

    new-array v1, p0, [Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, p0, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhp;

    if-eqz p2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget v1, v0, Lhp;->f:I

    if-ltz v1, :cond_2

    iget-object v1, v0, Lhp;->s:Lhv;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p0, v0, Lhp;->s:Lhv;

    invoke-virtual {p0}, Lhv;->c()Z

    move-result p0

    :goto_0
    if-eqz p0, :cond_2

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment already active and state has been saved"

    invoke-direct {p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iput-object p2, v0, Lhp;->h:Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-object v0

    :catch_0
    move-exception p0

    new-instance p2, Lhp$b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to instantiate fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": calling Fragment constructor caused an exception"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lhp$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    move-exception p0

    new-instance p2, Lhp$b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to instantiate fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": could not find Fragment constructor"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lhp$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_2
    move-exception p0

    new-instance p2, Lhp$b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to instantiate fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lhp$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_3
    move-exception p0

    new-instance p2, Lhp$b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to instantiate fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lhp$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_4
    move-exception p0

    new-instance p2, Lhp$b;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to instantiate fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": make sure class name exists, is public, and has an empty constructor that is public"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lhp$b;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    :try_start_0
    sget-object v0, Lhp;->X:Ldk;

    invoke-virtual {v0, p1}, Ldk;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object p0, Lhp;->X:Ldk;

    invoke-virtual {p0, p1, v0}, Ldk;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-class p0, Lhp;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method public static f()V
    .locals 0

    return-void
.end method

.method public static g()V
    .locals 0

    return-void
.end method

.method public static h()V
    .locals 0

    return-void
.end method

.method public static k()V
    .locals 0

    return-void
.end method

.method public static l()Landroid/view/animation/Animation;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static m()Landroid/animation/Animator;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static n()V
    .locals 0

    return-void
.end method

.method public static o()V
    .locals 0

    return-void
.end method


# virtual methods
.method final A()Lhp$a;
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    new-instance v0, Lhp$a;

    invoke-direct {v0}, Lhp$a;-><init>()V

    iput-object v0, p0, Lhp;->N:Lhp$a;

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    return-object v0
.end method

.method final B()I
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget v0, v0, Lhp$a;->d:I

    return v0
.end method

.method final C()I
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget v0, v0, Lhp$a;->e:I

    return v0
.end method

.method final D()I
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget v0, v0, Lhp$a;->f:I

    return v0
.end method

.method final E()Let;
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->o:Let;

    return-object v0
.end method

.method final F()Let;
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->p:Let;

    return-object v0
.end method

.method final G()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->a:Landroid/view/View;

    return-object v0
.end method

.method final H()Landroid/animation/Animator;
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->b:Landroid/animation/Animator;

    return-object v0
.end method

.method final I()I
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget v0, v0, Lhp$a;->c:I

    return v0
.end method

.method final J()Z
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-boolean v0, v0, Lhp$a;->q:Z

    return v0
.end method

.method final K()Z
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-boolean v0, v0, Lhp$a;->s:Z

    return v0
.end method

.method public final a()Lja;
    .locals 2

    invoke-virtual {p0}, Lhp;->d()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lhp;->w:Lja;

    if-nez v0, :cond_1

    new-instance v0, Lja;

    invoke-direct {v0}, Lja;-><init>()V

    iput-object v0, p0, Lhp;->w:Lja;

    :cond_1
    iget-object v0, p0, Lhp;->w:Lja;

    return-object v0
.end method

.method final a(I)V
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lhp;->A()Lhp$a;

    move-result-object v0

    iput p1, v0, Lhp$a;->d:I

    return-void
.end method

.method final a(II)V
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lhp;->A()Lhp$a;

    iget-object v0, p0, Lhp;->N:Lhp$a;

    iput p1, v0, Lhp$a;->e:I

    iget-object p1, p0, Lhp;->N:Lhp$a;

    iput p2, p1, Lhp$a;->f:I

    return-void
.end method

.method final a(ILhp;)V
    .locals 0

    iput p1, p0, Lhp;->f:I

    if-eqz p2, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p2, Lhp;->g:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    iget p2, p0, Lhp;->f:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lhp;->g:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "android:fragment:"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method final a(Landroid/animation/Animator;)V
    .locals 1

    invoke-virtual {p0}, Lhp;->A()Lhp$a;

    move-result-object v0

    iput-object p1, v0, Lhp$a;->b:Landroid/animation/Animator;

    return-void
.end method

.method final a(Landroid/os/Bundle;)V
    .locals 2

    if-eqz p1, :cond_1

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lhp;->u:Lhv;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lhp;->L()V

    :cond_0
    iget-object v0, p0, Lhp;->u:Lhv;

    iget-object v1, p0, Lhp;->v:Lhw;

    invoke-virtual {v0, p1, v1}, Lhv;->a(Landroid/os/Parcelable;Lhw;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lhp;->v:Lhw;

    iget-object p1, p0, Lhp;->u:Lhv;

    invoke-virtual {p1}, Lhv;->g()V

    :cond_1
    return-void
.end method

.method final a(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lhp;->A()Lhp$a;

    move-result-object v0

    iput-object p1, v0, Lhp$a;->a:Landroid/view/View;

    return-void
.end method

.method final a(Lhp$c;)V
    .locals 2

    invoke-virtual {p0}, Lhp;->A()Lhp$a;

    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->r:Lhp$c;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->r:Lhp$c;

    if-eqz v0, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to set a replacement startPostponedEnterTransition on "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-boolean v0, v0, Lhp$a;->q:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lhp;->N:Lhp$a;

    iput-object p1, v0, Lhp$a;->r:Lhp$c;

    :cond_2
    if-eqz p1, :cond_3

    invoke-interface {p1}, Lhp$c;->b()V

    :cond_3
    return-void
.end method

.method final a(Z)V
    .locals 1

    invoke-virtual {p0}, Lhp;->A()Lhp$a;

    move-result-object v0

    iput-boolean p1, v0, Lhp$a;->s:Z

    return-void
.end method

.method final b(I)V
    .locals 1

    invoke-virtual {p0}, Lhp;->A()Lhp$a;

    move-result-object v0

    iput p1, v0, Lhp$a;->c:I

    return-void
.end method

.method final b(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->f()V

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lhp;->b:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lhp;->H:Z

    iput-boolean v0, p0, Lhp;->H:Z

    invoke-virtual {p0, p1}, Lhp;->a(Landroid/os/Bundle;)V

    iget-object p1, p0, Lhp;->u:Lhv;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lhp;->u:Lhv;

    iget p1, p1, Lhv;->l:I

    if-lez p1, :cond_1

    move v1, v0

    :cond_1
    if-nez v1, :cond_2

    iget-object p1, p0, Lhp;->u:Lhv;

    invoke-virtual {p1}, Lhv;->g()V

    :cond_2
    iput-boolean v0, p0, Lhp;->S:Z

    iget-boolean p1, p0, Lhp;->H:Z

    if-nez p1, :cond_3

    new-instance p1, Lie;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " did not call through to super.onCreate()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lie;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, p0, Lhp;->T:Liq;

    sget-object v0, Lin$a;->ON_CREATE:Lin$a;

    invoke-virtual {p1, v0}, Liq;->a(Lin$a;)V

    return-void
.end method

.method final b()Z
    .locals 1

    iget v0, p0, Lhp;->r:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Lin;
    .locals 1

    iget-object v0, p0, Lhp;->T:Liq;

    return-object v0
.end method

.method final c(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->e()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method public final d()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lhp;->t:Lht;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->t:Lht;

    iget-object v0, v0, Lht;->c:Landroid/content/Context;

    return-object v0
.end method

.method public final e()Lhq;
    .locals 1

    iget-object v0, p0, Lhp;->t:Lht;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->t:Lht;

    iget-object v0, v0, Lht;->b:Landroid/app/Activity;

    check-cast v0, Lhq;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method final i()Landroid/view/LayoutInflater;
    .locals 3

    iget-object v0, p0, Lhp;->t:Lht;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lhp;->t:Lht;

    invoke-virtual {v0}, Lht;->c()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lhp;->u:Lhv;

    if-nez v1, :cond_4

    invoke-direct {p0}, Lhp;->L()V

    iget v1, p0, Lhp;->b:I

    const/4 v2, 0x4

    if-lt v1, v2, :cond_1

    iget-object v1, p0, Lhp;->u:Lhv;

    invoke-virtual {v1}, Lhv;->j()V

    goto :goto_0

    :cond_1
    iget v1, p0, Lhp;->b:I

    const/4 v2, 0x3

    if-lt v1, v2, :cond_2

    iget-object v1, p0, Lhp;->u:Lhv;

    invoke-virtual {v1}, Lhv;->i()V

    goto :goto_0

    :cond_2
    iget v1, p0, Lhp;->b:I

    const/4 v2, 0x2

    if-lt v1, v2, :cond_3

    iget-object v1, p0, Lhp;->u:Lhv;

    invoke-virtual {v1}, Lhv;->h()V

    goto :goto_0

    :cond_3
    iget v1, p0, Lhp;->b:I

    if-lez v1, :cond_4

    iget-object v1, p0, Lhp;->u:Lhv;

    invoke-virtual {v1}, Lhv;->g()V

    :cond_4
    :goto_0
    iget-object v1, p0, Lhp;->u:Lhv;

    invoke-static {v0, v1}, Lgh;->a(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    iput-object v0, p0, Lhp;->R:Landroid/view/LayoutInflater;

    iget-object v0, p0, Lhp;->R:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method public final j()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhp;->H:Z

    iget-object v1, p0, Lhp;->t:Lht;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lhp;->t:Lht;

    iget-object v1, v1, Lht;->b:Landroid/app/Activity;

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iput-boolean v1, p0, Lhp;->H:Z

    iput-boolean v0, p0, Lhp;->H:Z

    :cond_1
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhp;->H:Z

    return-void
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    invoke-virtual {p0}, Lhp;->e()Lhq;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lhq;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhp;->H:Z

    return-void
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final q()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->h:Ljava/lang/Object;

    sget-object v1, Lhp;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lhp;->p()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->h:Ljava/lang/Object;

    return-object v0
.end method

.method public final r()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final s()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->j:Ljava/lang/Object;

    sget-object v1, Lhp;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lhp;->r()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->j:Ljava/lang/Object;

    return-object v0
.end method

.method public final t()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {p0, v0}, Lfz;->a(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    iget v1, p0, Lhp;->f:I

    if-ltz v1, :cond_0

    const-string v1, " #"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhp;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    iget v1, p0, Lhp;->y:I

    if-eqz v1, :cond_1

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhp;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, Lhp;->A:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhp;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhp;->N:Lhp$a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->l:Ljava/lang/Object;

    sget-object v1, Lhp;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lhp;->t()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->l:Ljava/lang/Object;

    return-object v0
.end method

.method final v()V
    .locals 3

    iget-object v0, p0, Lhp;->N:Lhp$a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhp;->N:Lhp$a;

    const/4 v2, 0x0

    iput-boolean v2, v0, Lhp$a;->q:Z

    iget-object v0, p0, Lhp;->N:Lhp$a;

    iget-object v0, v0, Lhp$a;->r:Lhp$c;

    iget-object v2, p0, Lhp;->N:Lhp$a;

    iput-object v1, v2, Lhp$a;->r:Lhp$c;

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lhp$c;->a()V

    :cond_1
    return-void
.end method

.method final w()V
    .locals 2

    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->f()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhp;->q:Z

    new-instance v0, Lhp$3;

    invoke-direct {v0, p0}, Lhp$3;-><init>(Lhp;)V

    iput-object v0, p0, Lhp;->V:Lip;

    const/4 v0, 0x0

    iput-object v0, p0, Lhp;->U:Liq;

    iput-object v0, p0, Lhp;->J:Landroid/view/View;

    iget-object v1, p0, Lhp;->J:Landroid/view/View;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lhp;->V:Lip;

    invoke-interface {v0}, Lip;->c()Lin;

    iget-object v0, p0, Lhp;->W:Liu;

    iget-object v1, p0, Lhp;->V:Lip;

    invoke-virtual {v0, v1}, Liu;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v1, p0, Lhp;->U:Liq;

    if-eqz v1, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iput-object v0, p0, Lhp;->V:Lip;

    return-void
.end method

.method final x()V
    .locals 3

    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->f()V

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lhp;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhp;->H:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhp;->H:Z

    iget-boolean v0, p0, Lhp;->H:Z

    if-nez v0, :cond_1

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onActivityCreated()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->h()V

    :cond_2
    return-void
.end method

.method final y()V
    .locals 3

    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->f()V

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->d()Z

    :cond_0
    const/4 v0, 0x3

    iput v0, p0, Lhp;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhp;->H:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhp;->H:Z

    iget-boolean v0, p0, Lhp;->H:Z

    if-nez v0, :cond_1

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onStart()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->i()V

    :cond_2
    iget-object v0, p0, Lhp;->T:Liq;

    sget-object v1, Lin$a;->ON_START:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    iget-object v0, p0, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lhp;->U:Liq;

    sget-object v1, Lin$a;->ON_START:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    :cond_3
    return-void
.end method

.method final z()V
    .locals 3

    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->f()V

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->d()Z

    :cond_0
    const/4 v0, 0x4

    iput v0, p0, Lhp;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhp;->H:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhp;->H:Z

    iget-boolean v0, p0, Lhp;->H:Z

    if-nez v0, :cond_1

    new-instance v0, Lie;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not call through to super.onResume()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lie;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lhp;->u:Lhv;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->j()V

    iget-object v0, p0, Lhp;->u:Lhv;

    invoke-virtual {v0}, Lhv;->d()Z

    :cond_2
    iget-object v0, p0, Lhp;->T:Liq;

    sget-object v1, Lin$a;->ON_RESUME:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    iget-object v0, p0, Lhp;->J:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lhp;->U:Liq;

    sget-object v1, Lin$a;->ON_RESUME:Lin$a;

    invoke-virtual {v0, v1}, Liq;->a(Lin$a;)V

    :cond_3
    return-void
.end method
