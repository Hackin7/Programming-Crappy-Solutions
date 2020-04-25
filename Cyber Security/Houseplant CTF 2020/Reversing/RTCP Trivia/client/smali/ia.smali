.class final Lia;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lia$a;
    }
.end annotation


# static fields
.field private static final a:[I

.field private static final b:Lic;

.field private static final c:Lic;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lia;->a:[I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Lib;

    invoke-direct {v0}, Lib;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Lia;->b:Lic;

    invoke-static {}, Lia;->a()Lic;

    move-result-object v0

    sput-object v0, Lia;->c:Lic;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3
        0x0
        0x1
        0x5
        0x4
        0x7
        0x6
        0x9
        0x8
    .end array-data
.end method

.method static a(Lde;Lia$a;Ljava/lang/Object;Z)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Lia$a;",
            "Ljava/lang/Object;",
            "Z)",
            "Landroid/view/View;"
        }
    .end annotation

    iget-object p1, p1, Lia$a;->c:Lhn;

    if-eqz p2, :cond_1

    if-eqz p0, :cond_1

    iget-object p2, p1, Lhn;->r:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    iget-object p2, p1, Lhn;->r:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    if-eqz p3, :cond_0

    iget-object p1, p1, Lhn;->r:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lhn;->s:Ljava/util/ArrayList;

    goto :goto_0

    :goto_1
    invoke-virtual {p0, p1}, Lde;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(ILjava/util/ArrayList;Ljava/util/ArrayList;II)Lde;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)",
            "Lde<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lde;

    invoke-direct {v0}, Lde;-><init>()V

    add-int/lit8 p4, p4, -0x1

    :goto_0
    if-lt p4, p3, :cond_3

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhn;

    invoke-virtual {v1, p0}, Lhn;->b(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, v1, Lhn;->r:Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    iget-object v3, v1, Lhn;->r:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eqz v2, :cond_0

    iget-object v2, v1, Lhn;->r:Ljava/util/ArrayList;

    iget-object v1, v1, Lhn;->s:Ljava/util/ArrayList;

    goto :goto_1

    :cond_0
    iget-object v2, v1, Lhn;->r:Ljava/util/ArrayList;

    iget-object v1, v1, Lhn;->s:Ljava/util/ArrayList;

    move-object v8, v2

    move-object v2, v1

    move-object v1, v8

    :goto_1
    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_2

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0, v6}, Lde;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_1

    invoke-virtual {v0, v5, v7}, Lde;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_1
    invoke-virtual {v0, v5, v6}, Lde;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 p4, p4, -0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method static a(Lic;Lde;Ljava/lang/Object;Lia$a;)Lde;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic;",
            "Lde<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lia$a;",
            ")",
            "Lde<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    iget-object v0, p3, Lia$a;->a:Lhp;

    iget-object v1, v0, Lhp;->J:Landroid/view/View;

    invoke-virtual {p1}, Lde;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    if-eqz p2, :cond_8

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance p2, Lde;

    invoke-direct {p2}, Lde;-><init>()V

    invoke-virtual {p0, p2, v1}, Lic;->a(Ljava/util/Map;Landroid/view/View;)V

    iget-object p0, p3, Lia$a;->c:Lhn;

    iget-boolean p3, p3, Lia$a;->b:Z

    if-eqz p3, :cond_1

    invoke-virtual {v0}, Lhp;->F()Let;

    move-result-object p3

    iget-object p0, p0, Lhn;->r:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lhp;->E()Let;

    move-result-object p3

    iget-object p0, p0, Lhn;->s:Ljava/util/ArrayList;

    :goto_0
    if-eqz p0, :cond_2

    invoke-static {p2, p0}, Ldj;->a(Ljava/util/Map;Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lde;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {p2, v0}, Ldj;->a(Ljava/util/Map;Ljava/util/Collection;)Z

    :cond_2
    if-eqz p3, :cond_5

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    :goto_1
    if-ltz p3, :cond_7

    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p2, v0}, Lde;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_3

    invoke-static {p1, v0}, Lia;->a(Lde;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v0}, Lde;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lgq;->e(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {p1, v0}, Lia;->a(Lde;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v1}, Lgq;->e(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lde;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lde;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    :goto_3
    if-ltz p0, :cond_7

    invoke-virtual {p1, p0}, Lde;->c(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Lde;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_6

    invoke-virtual {p1, p0}, Lde;->d(I)Ljava/lang/Object;

    :cond_6
    add-int/lit8 p0, p0, -0x1

    goto :goto_3

    :cond_7
    return-object p2

    :cond_8
    :goto_4
    invoke-virtual {p1}, Lde;->clear()V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Lia$a;Landroid/util/SparseArray;I)Lia$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lia$a;",
            "Landroid/util/SparseArray<",
            "Lia$a;",
            ">;I)",
            "Lia$a;"
        }
    .end annotation

    if-nez p0, :cond_0

    new-instance p0, Lia$a;

    invoke-direct {p0}, Lia$a;-><init>()V

    invoke-virtual {p1, p2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method private static a()Lic;
    .locals 3

    :try_start_0
    const-string v0, "androidx.transition.FragmentTransitionSupport"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lic;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static a(Lhp;Lhp;)Lic;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lhp;->r()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, Lhp;->q()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Lhp;->u()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lhp;->p()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p1}, Lhp;->s()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p1}, Lhp;->t()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    const/4 p1, 0x0

    if-eqz p0, :cond_6

    return-object p1

    :cond_6
    sget-object p0, Lia;->b:Lic;

    if-eqz p0, :cond_7

    sget-object p0, Lia;->b:Lic;

    invoke-static {p0, v0}, Lia;->a(Lic;Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_7

    sget-object p0, Lia;->b:Lic;

    return-object p0

    :cond_7
    sget-object p0, Lia;->c:Lic;

    if-eqz p0, :cond_8

    sget-object p0, Lia;->c:Lic;

    invoke-static {p0, v0}, Lia;->a(Lic;Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_8

    sget-object p0, Lia;->c:Lic;

    return-object p0

    :cond_8
    sget-object p0, Lia;->b:Lic;

    if-nez p0, :cond_a

    sget-object p0, Lia;->c:Lic;

    if-eqz p0, :cond_9

    goto :goto_0

    :cond_9
    return-object p1

    :cond_a
    :goto_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid Transition types"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static a(Lic;Lhp;Lhp;Z)Ljava/lang/Object;
    .locals 0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p2}, Lhp;->u()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lhp;->t()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lic;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lic;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static a(Lic;Lhp;Z)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lhp;->s()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lhp;->p()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lic;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static a(Lic;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lhp;Z)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    if-eqz p4, :cond_3

    if-eqz p5, :cond_1

    iget-object p5, p4, Lhp;->N:Lhp$a;

    if-eqz p5, :cond_3

    iget-object p5, p4, Lhp;->N:Lhp$a;

    iget-object p5, p5, Lhp$a;->m:Ljava/lang/Boolean;

    if-nez p5, :cond_0

    goto :goto_1

    :cond_0
    iget-object p4, p4, Lhp;->N:Lhp$a;

    iget-object p4, p4, Lhp$a;->m:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    move v0, p4

    goto :goto_1

    :cond_1
    iget-object p5, p4, Lhp;->N:Lhp$a;

    if-eqz p5, :cond_3

    iget-object p5, p4, Lhp;->N:Lhp$a;

    iget-object p5, p5, Lhp$a;->n:Ljava/lang/Boolean;

    if-nez p5, :cond_2

    goto :goto_1

    :cond_2
    iget-object p4, p4, Lhp;->N:Lhp$a;

    iget-object p4, p4, Lhp$a;->n:Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {p0, p2, p1, p3}, Lic;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {p0, p2, p1, p3}, Lic;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static a(Lde;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p0}, Lde;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lde;->c(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lde;->b(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method static a(Lic;Ljava/lang/Object;Lhp;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic;",
            "Ljava/lang/Object;",
            "Lhp;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p2, p2, Lhp;->J:Landroid/view/View;

    if-eqz p2, :cond_0

    invoke-virtual {p0, v0, p2}, Lic;->a(Ljava/util/ArrayList;Landroid/view/View;)V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, v0}, Lic;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V

    return-object v0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    return-object v0
.end method

.method private static a(Lhn;Landroid/util/SparseArray;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn;",
            "Landroid/util/SparseArray<",
            "Lia$a;",
            ">;Z)V"
        }
    .end annotation

    iget-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhn$a;

    invoke-static {p0, v3, p1, v1, p2}, Lia;->a(Lhn;Lhn$a;Landroid/util/SparseArray;ZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static a(Lhn;Lhn$a;Landroid/util/SparseArray;ZZ)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn;",
            "Lhn$a;",
            "Landroid/util/SparseArray<",
            "Lia$a;",
            ">;ZZ)V"
        }
    .end annotation

    iget-object v6, p1, Lhn$a;->b:Lhp;

    if-nez v6, :cond_0

    return-void

    :cond_0
    iget v7, v6, Lhp;->z:I

    if-nez v7, :cond_1

    return-void

    :cond_1
    if-eqz p3, :cond_2

    sget-object v0, Lia;->a:[I

    iget p1, p1, Lhn$a;->a:I

    aget p1, v0, p1

    goto :goto_0

    :cond_2
    iget p1, p1, Lhn$a;->a:I

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_7

    packed-switch p1, :pswitch_data_0

    move p1, v0

    move v1, p1

    move v8, v1

    goto/16 :goto_6

    :pswitch_0
    if-eqz p4, :cond_3

    iget-boolean p1, v6, Lhp;->P:Z

    if-eqz p1, :cond_9

    iget-boolean p1, v6, Lhp;->B:Z

    if-nez p1, :cond_9

    iget-boolean p1, v6, Lhp;->l:Z

    if-eqz p1, :cond_9

    goto :goto_4

    :cond_3
    iget-boolean p1, v6, Lhp;->B:Z

    goto/16 :goto_5

    :pswitch_1
    if-eqz p4, :cond_4

    iget-boolean p1, v6, Lhp;->P:Z

    if-eqz p1, :cond_5

    iget-boolean p1, v6, Lhp;->l:Z

    if-eqz p1, :cond_5

    iget-boolean p1, v6, Lhp;->B:Z

    if-eqz p1, :cond_5

    :goto_1
    goto :goto_2

    :cond_4
    iget-boolean p1, v6, Lhp;->l:Z

    if-eqz p1, :cond_5

    iget-boolean p1, v6, Lhp;->B:Z

    if-nez p1, :cond_5

    goto :goto_1

    :pswitch_2
    if-eqz p4, :cond_6

    iget-boolean p1, v6, Lhp;->l:Z

    if-nez p1, :cond_5

    iget-object p1, v6, Lhp;->J:Landroid/view/View;

    if-eqz p1, :cond_5

    iget-object p1, v6, Lhp;->J:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_5

    iget p1, v6, Lhp;->Q:F

    const/4 v2, 0x0

    cmpl-float p1, p1, v2

    if-ltz p1, :cond_5

    :goto_2
    move p1, v1

    goto :goto_3

    :cond_5
    move p1, v0

    goto :goto_3

    :cond_6
    iget-boolean p1, v6, Lhp;->l:Z

    if-eqz p1, :cond_5

    iget-boolean p1, v6, Lhp;->B:Z

    if-nez p1, :cond_5

    goto :goto_2

    :goto_3
    move v8, p1

    move p1, v1

    move v1, v0

    goto :goto_6

    :cond_7
    :pswitch_3
    if-eqz p4, :cond_8

    iget-boolean p1, v6, Lhp;->O:Z

    goto :goto_5

    :cond_8
    iget-boolean p1, v6, Lhp;->l:Z

    if-nez p1, :cond_9

    iget-boolean p1, v6, Lhp;->B:Z

    if-nez p1, :cond_9

    :goto_4
    move p1, v1

    goto :goto_5

    :cond_9
    move p1, v0

    :goto_5
    move v8, v0

    move v0, p1

    move p1, v8

    :goto_6
    invoke-virtual {p2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lia$a;

    if-eqz v0, :cond_a

    invoke-static {v2, p2, v7}, Lia;->a(Lia$a;Landroid/util/SparseArray;I)Lia$a;

    move-result-object v2

    iput-object v6, v2, Lia$a;->a:Lhp;

    iput-boolean p3, v2, Lia$a;->b:Z

    iput-object p0, v2, Lia$a;->c:Lhn;

    :cond_a
    move-object v9, v2

    const/4 v10, 0x0

    if-nez p4, :cond_c

    if-eqz v1, :cond_c

    if-eqz v9, :cond_b

    iget-object v0, v9, Lia$a;->d:Lhp;

    if-ne v0, v6, :cond_b

    iput-object v10, v9, Lia$a;->d:Lhp;

    :cond_b
    iget-object v0, p0, Lhn;->a:Lhv;

    iget v1, v6, Lhp;->b:I

    if-gtz v1, :cond_c

    iget v1, v0, Lhv;->l:I

    if-lez v1, :cond_c

    iget-boolean v1, p0, Lhn;->t:Z

    if-nez v1, :cond_c

    invoke-virtual {v0, v6}, Lhv;->b(Lhp;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lhv;->a(Lhp;IIIZ)V

    :cond_c
    if-eqz v8, :cond_e

    if-eqz v9, :cond_d

    iget-object v0, v9, Lia$a;->d:Lhp;

    if-nez v0, :cond_e

    :cond_d
    invoke-static {v9, p2, v7}, Lia;->a(Lia$a;Landroid/util/SparseArray;I)Lia$a;

    move-result-object v9

    iput-object v6, v9, Lia$a;->d:Lhp;

    iput-boolean p3, v9, Lia$a;->e:Z

    iput-object p0, v9, Lia$a;->f:Lhn;

    :cond_e
    if-nez p4, :cond_f

    if-eqz p1, :cond_f

    if-eqz v9, :cond_f

    iget-object p0, v9, Lia$a;->a:Lhp;

    if-ne p0, v6, :cond_f

    iput-object v10, v9, Lia$a;->a:Lhp;

    :cond_f
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static a(Lhp;Lhp;ZLde;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp;",
            "Lhp;",
            "Z",
            "Lde<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lhp;->E()Let;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lhp;->E()Let;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_2

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    if-nez p3, :cond_1

    move v0, p2

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lde;->size()I

    move-result v0

    :goto_1
    if-ge p2, v0, :cond_2

    invoke-virtual {p3, p2}, Lde;->b(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3, p2}, Lde;->c(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method static a(Lhv;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZ)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhv;",
            "Ljava/util/ArrayList<",
            "Lhn;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;IIZ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move/from16 v4, p5

    iget v5, v0, Lhv;->l:I

    if-gtz v5, :cond_0

    return-void

    :cond_0
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    move/from16 v6, p3

    :goto_0
    if-ge v6, v3, :cond_2

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lhn;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-static {v7, v5, v4}, Lia;->b(Lhn;Landroid/util/SparseArray;Z)V

    goto :goto_1

    :cond_1
    invoke-static {v7, v5, v4}, Lia;->a(Lhn;Landroid/util/SparseArray;Z)V

    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v6

    if-eqz v6, :cond_20

    new-instance v6, Landroid/view/View;

    iget-object v7, v0, Lhv;->m:Lht;

    iget-object v7, v7, Lht;->c:Landroid/content/Context;

    invoke-direct {v6, v7}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v15

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v15, :cond_20

    invoke-virtual {v5, v13}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v7

    move/from16 v12, p3

    invoke-static {v7, v1, v2, v12, v3}, Lia;->a(ILjava/util/ArrayList;Ljava/util/ArrayList;II)Lde;

    move-result-object v11

    invoke-virtual {v5, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lia$a;

    const/16 v20, 0x0

    if-eqz v4, :cond_12

    iget-object v8, v0, Lhv;->n:Lhr;

    invoke-virtual {v8}, Lhr;->a()Z

    move-result v8

    if-eqz v8, :cond_3

    iget-object v8, v0, Lhv;->n:Lhr;

    invoke-virtual {v8, v7}, Lhr;->a(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    goto :goto_3

    :cond_3
    move-object/from16 v7, v20

    :goto_3
    if-eqz v7, :cond_10

    iget-object v8, v10, Lia$a;->a:Lhp;

    iget-object v9, v10, Lia$a;->d:Lhp;

    invoke-static {v9, v8}, Lia;->a(Lhp;Lhp;)Lic;

    move-result-object v14

    if-eqz v14, :cond_10

    iget-boolean v1, v10, Lia$a;->b:Z

    iget-boolean v2, v10, Lia$a;->e:Z

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v29, v5

    invoke-static {v14, v8, v1}, Lia;->a(Lic;Lhp;Z)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14, v9, v2}, Lia;->b(Lic;Lhp;Z)Ljava/lang/Object;

    move-result-object v2

    iget-object v12, v10, Lia$a;->a:Lhp;

    move/from16 v30, v13

    iget-object v13, v10, Lia$a;->d:Lhp;

    if-eqz v12, :cond_4

    move/from16 v31, v15

    iget-object v15, v12, Lhp;->J:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_4
    move/from16 v31, v15

    :goto_4
    if-eqz v12, :cond_d

    if-nez v13, :cond_5

    goto/16 :goto_9

    :cond_5
    iget-boolean v0, v10, Lia$a;->b:Z

    invoke-virtual {v11}, Lde;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_6

    move/from16 v32, v1

    move-object/from16 v15, v20

    goto :goto_5

    :cond_6
    invoke-static {v14, v12, v13, v0}, Lia;->a(Lic;Lhp;Lhp;Z)Ljava/lang/Object;

    move-result-object v15

    move/from16 v32, v1

    :goto_5
    invoke-static {v14, v11, v15, v10}, Lia;->b(Lic;Lde;Ljava/lang/Object;Lia$a;)Lde;

    move-result-object v1

    move-object/from16 v33, v8

    invoke-static {v14, v11, v15, v10}, Lia;->a(Lic;Lde;Ljava/lang/Object;Lia$a;)Lde;

    move-result-object v8

    invoke-virtual {v11}, Lde;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_9

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lde;->clear()V

    :cond_7
    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lde;->clear()V

    :cond_8
    move-object/from16 v15, v20

    goto :goto_6

    :cond_9
    move-object/from16 v34, v15

    invoke-virtual {v11}, Lde;->keySet()Ljava/util/Set;

    move-result-object v15

    invoke-static {v4, v1, v15}, Lia;->a(Ljava/util/ArrayList;Lde;Ljava/util/Collection;)V

    invoke-virtual {v11}, Lde;->values()Ljava/util/Collection;

    move-result-object v15

    invoke-static {v3, v8, v15}, Lia;->a(Ljava/util/ArrayList;Lde;Ljava/util/Collection;)V

    move-object/from16 v15, v34

    :goto_6
    if-nez v5, :cond_a

    if-nez v2, :cond_a

    if-nez v15, :cond_a

    move-object/from16 v36, v3

    :goto_7
    move-object/from16 v35, v11

    goto :goto_a

    :cond_a
    invoke-static {v12, v13, v0, v1}, Lia;->a(Lhp;Lhp;ZLde;)V

    if-eqz v15, :cond_c

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14, v15, v6, v4}, Lic;->a(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    move-object/from16 v35, v11

    iget-boolean v11, v10, Lia$a;->e:Z

    move-object/from16 v36, v3

    iget-object v3, v10, Lia$a;->f:Lhn;

    move-object/from16 v21, v14

    move-object/from16 v22, v15

    move-object/from16 v23, v2

    move-object/from16 v24, v1

    move/from16 v25, v11

    move-object/from16 v26, v3

    invoke-static/range {v21 .. v26}, Lia;->a(Lic;Ljava/lang/Object;Ljava/lang/Object;Lde;ZLhn;)V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v8, v10, v5, v0}, Lia;->a(Lde;Lia$a;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v20

    if-eqz v20, :cond_b

    invoke-virtual {v14, v5, v1}, Lic;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_b
    move-object/from16 v28, v1

    move-object/from16 v26, v20

    goto :goto_8

    :cond_c
    move-object/from16 v36, v3

    move-object/from16 v35, v11

    move-object/from16 v26, v20

    move-object/from16 v28, v26

    :goto_8
    new-instance v1, Lia$3;

    move-object/from16 v21, v1

    move-object/from16 v22, v12

    move-object/from16 v23, v13

    move/from16 v24, v0

    move-object/from16 v25, v8

    move-object/from16 v27, v14

    invoke-direct/range {v21 .. v28}, Lia$3;-><init>(Lhp;Lhp;ZLde;Landroid/view/View;Lic;Landroid/graphics/Rect;)V

    invoke-static {v7, v1}, Lid;->a(Landroid/view/View;Ljava/lang/Runnable;)Lid;

    goto :goto_b

    :cond_d
    :goto_9
    move/from16 v32, v1

    move-object/from16 v36, v3

    move-object/from16 v33, v8

    goto :goto_7

    :goto_a
    move-object/from16 v15, v20

    :goto_b
    if-nez v5, :cond_e

    if-nez v15, :cond_e

    if-eqz v2, :cond_11

    :cond_e
    invoke-static {v14, v2, v9, v4, v6}, Lia;->a(Lic;Ljava/lang/Object;Lhp;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v0

    move-object/from16 v1, v33

    move-object/from16 v3, v36

    invoke-static {v14, v5, v1, v3, v6}, Lia;->a(Lic;Ljava/lang/Object;Lhp;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v8

    const/4 v10, 0x4

    invoke-static {v8, v10}, Lia;->a(Ljava/util/ArrayList;I)V

    move-object/from16 v21, v14

    move-object/from16 v22, v5

    move-object/from16 v23, v2

    move-object/from16 v24, v15

    move-object/from16 v25, v1

    move/from16 v26, v32

    invoke-static/range {v21 .. v26}, Lia;->a(Lic;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lhp;Z)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_11

    if-eqz v9, :cond_f

    if-eqz v2, :cond_f

    iget-boolean v10, v9, Lhp;->l:Z

    if-eqz v10, :cond_f

    iget-boolean v10, v9, Lhp;->B:Z

    if-eqz v10, :cond_f

    iget-boolean v10, v9, Lhp;->P:Z

    if-eqz v10, :cond_f

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lhp;->a(Z)V

    iget-object v10, v9, Lhp;->J:Landroid/view/View;

    invoke-virtual {v14, v2, v10, v0}, Lic;->b(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    iget-object v9, v9, Lhp;->I:Landroid/view/ViewGroup;

    new-instance v10, Lia$1;

    invoke-direct {v10, v0}, Lia$1;-><init>(Ljava/util/ArrayList;)V

    invoke-static {v9, v10}, Lid;->a(Landroid/view/View;Ljava/lang/Runnable;)Lid;

    :cond_f
    invoke-static {v3}, Lic;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v20

    move-object/from16 v21, v14

    move-object/from16 v22, v1

    move-object/from16 v23, v5

    move-object/from16 v24, v8

    move-object/from16 v25, v2

    move-object/from16 v26, v0

    move-object/from16 v27, v15

    move-object/from16 v28, v3

    invoke-virtual/range {v21 .. v28}, Lic;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    invoke-virtual {v14, v7, v1}, Lic;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    move-object/from16 v16, v14

    move-object/from16 v17, v7

    move-object/from16 v18, v4

    move-object/from16 v19, v3

    move-object/from16 v21, v35

    invoke-virtual/range {v16 .. v21}, Lic;->a(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V

    const/4 v0, 0x0

    invoke-static {v8, v0}, Lia;->a(Ljava/util/ArrayList;I)V

    invoke-virtual {v14, v15, v4, v3}, Lic;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    goto/16 :goto_13

    :cond_10
    move-object/from16 v29, v5

    move/from16 v30, v13

    move/from16 v31, v15

    :cond_11
    const/4 v0, 0x0

    goto/16 :goto_13

    :cond_12
    move-object v1, v0

    move-object/from16 v29, v5

    move-object/from16 v35, v11

    move/from16 v30, v13

    move/from16 v31, v15

    const/4 v0, 0x0

    iget-object v2, v1, Lhv;->n:Lhr;

    invoke-virtual {v2}, Lhr;->a()Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v1, Lhv;->n:Lhr;

    invoke-virtual {v2, v7}, Lhr;->a(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_c

    :cond_13
    move-object/from16 v2, v20

    :goto_c
    if-eqz v2, :cond_1e

    iget-object v3, v10, Lia$a;->a:Lhp;

    iget-object v4, v10, Lia$a;->d:Lhp;

    invoke-static {v4, v3}, Lia;->a(Lhp;Lhp;)Lic;

    move-result-object v5

    if-eqz v5, :cond_1e

    iget-boolean v7, v10, Lia$a;->b:Z

    iget-boolean v8, v10, Lia$a;->e:Z

    invoke-static {v5, v3, v7}, Lia;->a(Lic;Lhp;Z)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5, v4, v8}, Lia;->b(Lic;Lhp;Z)Ljava/lang/Object;

    move-result-object v8

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    iget-object v14, v10, Lia$a;->a:Lhp;

    iget-object v13, v10, Lia$a;->d:Lhp;

    if-eqz v14, :cond_1a

    if-nez v13, :cond_14

    goto/16 :goto_10

    :cond_14
    iget-boolean v12, v10, Lia$a;->b:Z

    move-object/from16 v11, v35

    invoke-virtual {v11}, Lde;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_15

    move-object/from16 v0, v20

    goto :goto_d

    :cond_15
    invoke-static {v5, v14, v13, v12}, Lia;->a(Lic;Lhp;Lhp;Z)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v0, v16

    :goto_d
    invoke-static {v5, v11, v0, v10}, Lia;->b(Lic;Lde;Ljava/lang/Object;Lia$a;)Lde;

    move-result-object v1

    invoke-virtual {v11}, Lde;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_16

    move-object/from16 v0, v20

    goto :goto_e

    :cond_16
    move-object/from16 v37, v0

    invoke-virtual {v1}, Lde;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v0, v37

    :goto_e
    if-nez v9, :cond_17

    if-nez v8, :cond_17

    if-nez v0, :cond_17

    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v45, v7

    move-object v1, v8

    move-object v3, v9

    move-object v0, v10

    move-object/from16 v42, v11

    move-object/from16 v44, v15

    move-object/from16 v17, v20

    move/from16 v22, v30

    move/from16 v21, v31

    const/16 v23, 0x0

    goto/16 :goto_12

    :cond_17
    invoke-static {v14, v13, v12, v1}, Lia;->a(Lhp;Lhp;ZLde;)V

    if-eqz v0, :cond_18

    move-object/from16 v38, v3

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v5, v0, v6, v7}, Lic;->a(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    move-object/from16 v39, v7

    iget-boolean v7, v10, Lia$a;->e:Z

    move-object/from16 v40, v4

    iget-object v4, v10, Lia$a;->f:Lhn;

    move-object/from16 v17, v11

    move-object v11, v5

    move/from16 v18, v12

    move-object v12, v0

    move-object/from16 v19, v13

    move-object v13, v8

    move-object/from16 v21, v14

    move-object v14, v1

    move-object v1, v15

    move v15, v7

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v16}, Lia;->a(Lic;Ljava/lang/Object;Ljava/lang/Object;Lde;ZLhn;)V

    if-eqz v9, :cond_19

    invoke-virtual {v5, v9, v3}, Lic;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    goto :goto_f

    :cond_18
    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v39, v7

    move-object/from16 v17, v11

    move/from16 v18, v12

    move-object/from16 v19, v13

    move-object/from16 v21, v14

    move-object v1, v15

    move-object/from16 v3, v20

    :cond_19
    :goto_f
    new-instance v4, Lia$4;

    move-object/from16 v15, v39

    move-object v7, v4

    move-object v14, v8

    move-object v8, v5

    move-object v13, v9

    move-object/from16 v9, v17

    move-object v12, v10

    move-object v10, v0

    move-object/from16 v41, v0

    move-object/from16 v0, v17

    move-object v11, v12

    move-object/from16 v42, v0

    move-object v0, v12

    move-object v12, v1

    move-object/from16 v43, v13

    move/from16 v22, v30

    move-object v13, v6

    move-object/from16 v44, v1

    move-object v1, v14

    const/16 v23, 0x0

    move-object/from16 v14, v21

    move-object/from16 v45, v15

    move/from16 v21, v31

    move-object/from16 v15, v19

    move/from16 v16, v18

    move-object/from16 v17, v45

    move-object/from16 v18, v43

    move-object/from16 v19, v3

    invoke-direct/range {v7 .. v19}, Lia$4;-><init>(Lic;Lde;Ljava/lang/Object;Lia$a;Ljava/util/ArrayList;Landroid/view/View;Lhp;Lhp;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V

    invoke-static {v2, v4}, Lid;->a(Landroid/view/View;Ljava/lang/Runnable;)Lid;

    move-object/from16 v17, v41

    goto :goto_11

    :cond_1a
    :goto_10
    move/from16 v23, v0

    move-object/from16 v38, v3

    move-object/from16 v40, v4

    move-object/from16 v45, v7

    move-object v1, v8

    move-object/from16 v43, v9

    move-object v0, v10

    move-object/from16 v44, v15

    move/from16 v22, v30

    move/from16 v21, v31

    move-object/from16 v42, v35

    move-object/from16 v17, v20

    :goto_11
    move-object/from16 v3, v43

    :goto_12
    if-nez v3, :cond_1b

    if-nez v17, :cond_1b

    if-eqz v1, :cond_1f

    :cond_1b
    move-object/from16 v4, v40

    move-object/from16 v7, v45

    invoke-static {v5, v1, v4, v7, v6}, Lia;->a(Lic;Ljava/lang/Object;Lhp;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v4

    if-eqz v4, :cond_1c

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1d

    :cond_1c
    move-object/from16 v1, v20

    :cond_1d
    invoke-virtual {v5, v3, v6}, Lic;->b(Ljava/lang/Object;Landroid/view/View;)V

    iget-boolean v0, v0, Lia$a;->b:Z

    move-object v11, v5

    move-object v12, v3

    move-object v13, v1

    move-object/from16 v14, v17

    move-object/from16 v15, v38

    move/from16 v16, v0

    invoke-static/range {v11 .. v16}, Lia;->a(Lic;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lhp;Z)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1f

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v5

    move-object v12, v0

    move-object v13, v3

    move-object v14, v10

    move-object v15, v1

    move-object/from16 v16, v4

    move-object/from16 v18, v44

    invoke-virtual/range {v11 .. v18}, Lic;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    new-instance v15, Lia$2;

    move-object v7, v15

    move-object v8, v3

    move-object v9, v5

    move-object v3, v10

    move-object v10, v6

    move-object/from16 v11, v38

    move-object/from16 v12, v44

    move-object v13, v3

    move-object v14, v4

    move-object v3, v15

    move-object v15, v1

    invoke-direct/range {v7 .. v15}, Lia$2;-><init>(Ljava/lang/Object;Lic;Landroid/view/View;Lhp;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lid;->a(Landroid/view/View;Ljava/lang/Runnable;)Lid;

    new-instance v1, Lic$2;

    move-object/from16 v3, v42

    move-object/from16 v4, v44

    invoke-direct {v1, v5, v4, v3}, Lic$2;-><init>(Lic;Ljava/util/ArrayList;Ljava/util/Map;)V

    invoke-static {v2, v1}, Lid;->a(Landroid/view/View;Ljava/lang/Runnable;)Lid;

    invoke-virtual {v5, v2, v0}, Lic;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    new-instance v0, Lic$3;

    invoke-direct {v0, v5, v4, v3}, Lic$3;-><init>(Lic;Ljava/util/ArrayList;Ljava/util/Map;)V

    invoke-static {v2, v0}, Lid;->a(Landroid/view/View;Ljava/lang/Runnable;)Lid;

    goto :goto_14

    :cond_1e
    :goto_13
    move/from16 v23, v0

    move/from16 v22, v30

    move/from16 v21, v31

    :cond_1f
    :goto_14
    add-int/lit8 v13, v22, 0x1

    move/from16 v15, v21

    move-object/from16 v5, v29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move/from16 v4, p5

    goto/16 :goto_2

    :cond_20
    return-void
.end method

.method private static a(Lic;Ljava/lang/Object;Ljava/lang/Object;Lde;ZLhn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lde<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;Z",
            "Lhn;",
            ")V"
        }
    .end annotation

    iget-object v0, p5, Lhn;->r:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p5, Lhn;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    iget-object p4, p5, Lhn;->s:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    goto :goto_1

    :cond_0
    iget-object p4, p5, Lhn;->r:Ljava/util/ArrayList;

    goto :goto_0

    :goto_1
    invoke-virtual {p3, p4}, Lde;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    invoke-virtual {p0, p1, p3}, Lic;->a(Ljava/lang/Object;Landroid/view/View;)V

    if-eqz p2, :cond_1

    invoke-virtual {p0, p2, p3}, Lic;->a(Ljava/lang/Object;Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method static a(Ljava/util/ArrayList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static a(Ljava/util/ArrayList;Lde;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Lde<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lde;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p1, v0}, Lde;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Lgq;->e(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static a(Lic;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Lic;->a(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private static b(Lic;Lde;Ljava/lang/Object;Lia$a;)Lde;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic;",
            "Lde<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lia$a;",
            ")",
            "Lde<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lde;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    if-nez p2, :cond_0

    goto :goto_3

    :cond_0
    iget-object p2, p3, Lia$a;->d:Lhp;

    new-instance v0, Lde;

    invoke-direct {v0}, Lde;-><init>()V

    iget-object v1, p2, Lhp;->J:Landroid/view/View;

    invoke-virtual {p0, v0, v1}, Lic;->a(Ljava/util/Map;Landroid/view/View;)V

    iget-object p0, p3, Lia$a;->f:Lhn;

    iget-boolean p3, p3, Lia$a;->e:Z

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Lhp;->E()Let;

    move-result-object p2

    iget-object p0, p0, Lhn;->s:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lhp;->F()Let;

    move-result-object p2

    iget-object p0, p0, Lhn;->r:Ljava/util/ArrayList;

    :goto_0
    invoke-static {v0, p0}, Ldj;->a(Ljava/util/Map;Ljava/util/Collection;)Z

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_1
    if-ltz p2, :cond_5

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {v0, p3}, Lde;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_2

    invoke-virtual {p1, p3}, Lde;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-static {v1}, Lgq;->e(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p1, p3}, Lde;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-static {v1}, Lgq;->e(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p3}, Lde;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_2
    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Lde;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-static {p1, p0}, Ldj;->a(Ljava/util/Map;Ljava/util/Collection;)Z

    :cond_5
    return-object v0

    :cond_6
    :goto_3
    invoke-virtual {p1}, Lde;->clear()V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static b(Lic;Lhp;Z)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lhp;->q()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lhp;->r()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lic;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static b(Lhn;Landroid/util/SparseArray;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn;",
            "Landroid/util/SparseArray<",
            "Lia$a;",
            ">;Z)V"
        }
    .end annotation

    iget-object v0, p0, Lhn;->a:Lhv;

    iget-object v0, v0, Lhv;->n:Lhr;

    invoke-virtual {v0}, Lhr;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v2, p0, Lhn;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhn$a;

    invoke-static {p0, v2, p1, v1, p2}, Lia;->a(Lhn;Lhn$a;Landroid/util/SparseArray;ZZ)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method
