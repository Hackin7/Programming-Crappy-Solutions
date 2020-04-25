.class abstract Lq$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# instance fields
.field A:Z

.field B:I

.field C:I

.field D:I

.field E:Z

.field F:Landroid/graphics/ColorFilter;

.field G:Z

.field H:Landroid/content/res/ColorStateList;

.field I:Landroid/graphics/PorterDuff$Mode;

.field J:Z

.field K:Z

.field final c:Lq;

.field d:Landroid/content/res/Resources;

.field e:I

.field f:I

.field g:I

.field h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field i:[Landroid/graphics/drawable/Drawable;

.field j:I

.field k:Z

.field l:Z

.field m:Landroid/graphics/Rect;

.field n:Z

.field o:Z

.field p:I

.field q:I

.field r:I

.field s:I

.field t:Z

.field u:I

.field v:Z

.field w:Z

.field x:Z

.field y:Z

.field z:Z


# direct methods
.method constructor <init>(Lq$b;Lq;Landroid/content/res/Resources;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/16 v0, 0xa0

    iput v0, p0, Lq$b;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq$b;->k:Z

    iput-boolean v0, p0, Lq$b;->n:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lq$b;->z:Z

    iput v0, p0, Lq$b;->C:I

    iput v0, p0, Lq$b;->D:I

    iput-object p2, p0, Lq$b;->c:Lq;

    if-eqz p3, :cond_0

    move-object p2, p3

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-object p2, p1, Lq$b;->d:Landroid/content/res/Resources;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iput-object p2, p0, Lq$b;->d:Landroid/content/res/Resources;

    if-eqz p1, :cond_2

    iget p2, p1, Lq$b;->e:I

    goto :goto_1

    :cond_2
    move p2, v0

    :goto_1
    invoke-static {p3, p2}, Lq;->a(Landroid/content/res/Resources;I)I

    move-result p2

    iput p2, p0, Lq$b;->e:I

    if-eqz p1, :cond_b

    iget p2, p1, Lq$b;->f:I

    iput p2, p0, Lq$b;->f:I

    iget p2, p1, Lq$b;->g:I

    iput p2, p0, Lq$b;->g:I

    iput-boolean v1, p0, Lq$b;->x:Z

    iput-boolean v1, p0, Lq$b;->y:Z

    iget-boolean p2, p1, Lq$b;->k:Z

    iput-boolean p2, p0, Lq$b;->k:Z

    iget-boolean p2, p1, Lq$b;->n:Z

    iput-boolean p2, p0, Lq$b;->n:Z

    iget-boolean p2, p1, Lq$b;->z:Z

    iput-boolean p2, p0, Lq$b;->z:Z

    iget-boolean p2, p1, Lq$b;->A:Z

    iput-boolean p2, p0, Lq$b;->A:Z

    iget p2, p1, Lq$b;->B:I

    iput p2, p0, Lq$b;->B:I

    iget p2, p1, Lq$b;->C:I

    iput p2, p0, Lq$b;->C:I

    iget p2, p1, Lq$b;->D:I

    iput p2, p0, Lq$b;->D:I

    iget-boolean p2, p1, Lq$b;->E:Z

    iput-boolean p2, p0, Lq$b;->E:Z

    iget-object p2, p1, Lq$b;->F:Landroid/graphics/ColorFilter;

    iput-object p2, p0, Lq$b;->F:Landroid/graphics/ColorFilter;

    iget-boolean p2, p1, Lq$b;->G:Z

    iput-boolean p2, p0, Lq$b;->G:Z

    iget-object p2, p1, Lq$b;->H:Landroid/content/res/ColorStateList;

    iput-object p2, p0, Lq$b;->H:Landroid/content/res/ColorStateList;

    iget-object p2, p1, Lq$b;->I:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, Lq$b;->I:Landroid/graphics/PorterDuff$Mode;

    iget-boolean p2, p1, Lq$b;->J:Z

    iput-boolean p2, p0, Lq$b;->J:Z

    iget-boolean p2, p1, Lq$b;->K:Z

    iput-boolean p2, p0, Lq$b;->K:Z

    iget p2, p1, Lq$b;->e:I

    iget p3, p0, Lq$b;->e:I

    if-ne p2, p3, :cond_4

    iget-boolean p2, p1, Lq$b;->l:Z

    if-eqz p2, :cond_3

    new-instance p2, Landroid/graphics/Rect;

    iget-object p3, p1, Lq$b;->m:Landroid/graphics/Rect;

    invoke-direct {p2, p3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object p2, p0, Lq$b;->m:Landroid/graphics/Rect;

    iput-boolean v1, p0, Lq$b;->l:Z

    :cond_3
    iget-boolean p2, p1, Lq$b;->o:Z

    if-eqz p2, :cond_4

    iget p2, p1, Lq$b;->p:I

    iput p2, p0, Lq$b;->p:I

    iget p2, p1, Lq$b;->q:I

    iput p2, p0, Lq$b;->q:I

    iget p2, p1, Lq$b;->r:I

    iput p2, p0, Lq$b;->r:I

    iget p2, p1, Lq$b;->s:I

    iput p2, p0, Lq$b;->s:I

    iput-boolean v1, p0, Lq$b;->o:Z

    :cond_4
    iget-boolean p2, p1, Lq$b;->t:Z

    if-eqz p2, :cond_5

    iget p2, p1, Lq$b;->u:I

    iput p2, p0, Lq$b;->u:I

    iput-boolean v1, p0, Lq$b;->t:Z

    :cond_5
    iget-boolean p2, p1, Lq$b;->v:Z

    if-eqz p2, :cond_6

    iget-boolean p2, p1, Lq$b;->w:Z

    iput-boolean p2, p0, Lq$b;->w:Z

    iput-boolean v1, p0, Lq$b;->v:Z

    :cond_6
    iget-object p2, p1, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    array-length p3, p2

    new-array p3, p3, [Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    iget p3, p1, Lq$b;->j:I

    iput p3, p0, Lq$b;->j:I

    iget-object p1, p1, Lq$b;->h:Landroid/util/SparseArray;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/util/SparseArray;->clone()Landroid/util/SparseArray;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lq$b;->h:Landroid/util/SparseArray;

    goto :goto_3

    :cond_7
    new-instance p1, Landroid/util/SparseArray;

    iget p3, p0, Lq$b;->j:I

    invoke-direct {p1, p3}, Landroid/util/SparseArray;-><init>(I)V

    goto :goto_2

    :goto_3
    iget p1, p0, Lq$b;->j:I

    :goto_4
    if-ge v0, p1, :cond_a

    aget-object p3, p2, v0

    if-eqz p3, :cond_9

    aget-object p3, p2, v0

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p3

    if-eqz p3, :cond_8

    iget-object v1, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {v1, v0, p3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_5

    :cond_8
    iget-object p3, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    aget-object v1, p2, v0

    aput-object v1, p3, v0

    :cond_9
    :goto_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_a
    return-void

    :cond_b
    const/16 p1, 0xa

    new-array p1, p1, [Landroid/graphics/drawable/Drawable;

    iput-object p1, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    iput v0, p0, Lq$b;->j:I

    return-void
.end method

.method private b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    iget v0, p0, Lq$b;->B:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v0, p0, Lq$b;->c:Lq;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-object p1
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)I
    .locals 4

    iget v0, p0, Lq$b;->j:I

    iget-object v1, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    array-length v1, v1

    if-lt v0, v1, :cond_0

    add-int/lit8 v1, v0, 0xa

    invoke-virtual {p0, v0, v1}, Lq$b;->b(II)V

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    iget-object v3, p0, Lq$b;->c:Lq;

    invoke-virtual {p1, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object v3, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    aput-object p1, v3, v0

    iget v3, p0, Lq$b;->j:I

    add-int/2addr v3, v1

    iput v3, p0, Lq$b;->j:I

    iget v1, p0, Lq$b;->g:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result p1

    or-int/2addr p1, v1

    iput p1, p0, Lq$b;->g:I

    invoke-virtual {p0}, Lq$b;->b()V

    const/4 p1, 0x0

    iput-object p1, p0, Lq$b;->m:Landroid/graphics/Rect;

    iput-boolean v2, p0, Lq$b;->l:Z

    iput-boolean v2, p0, Lq$b;->o:Z

    iput-boolean v2, p0, Lq$b;->x:Z

    return v0
.end method

.method a()V
    .locals 4

    iget v0, p0, Lq$b;->j:I

    iget-object v1, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, v1, v2

    if-eqz v3, :cond_0

    aget-object v3, v1, v2

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lq$b;->A:Z

    return-void
.end method

.method final a(Landroid/content/res/Resources;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lq$b;->d:Landroid/content/res/Resources;

    iget v0, p0, Lq$b;->e:I

    invoke-static {p1, v0}, Lq;->a(Landroid/content/res/Resources;I)I

    move-result p1

    iget v0, p0, Lq$b;->e:I

    iput p1, p0, Lq$b;->e:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lq$b;->o:Z

    iput-boolean p1, p0, Lq$b;->l:Z

    :cond_0
    return-void
.end method

.method public final b(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    iget-object v0, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lq$b;->h:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v0

    if-ltz v0, :cond_2

    iget-object v2, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    iget-object v3, p0, Lq$b;->d:Landroid/content/res/Resources;

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-direct {p0, v2}, Lq$b;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v3, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    aput-object v2, v3, p1

    iget-object p1, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->removeAt(I)V

    iget-object p1, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-nez p1, :cond_1

    iput-object v1, p0, Lq$b;->h:Landroid/util/SparseArray;

    :cond_1
    return-object v2

    :cond_2
    return-object v1
.end method

.method final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq$b;->t:Z

    iput-boolean v0, p0, Lq$b;->v:Z

    return-void
.end method

.method public b(II)V
    .locals 2

    new-array p2, p2, [Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-static {v0, v1, p2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p2, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method final c()V
    .locals 6

    iget-object v0, p0, Lq$b;->h:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    iget-object v3, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/Drawable$ConstantState;

    iget-object v4, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    iget-object v5, p0, Lq$b;->d:Landroid/content/res/Resources;

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-direct {p0, v3}, Lq$b;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    aput-object v3, v4, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lq$b;->h:Landroid/util/SparseArray;

    :cond_1
    return-void
.end method

.method public canApplyTheme()Z
    .locals 6

    iget v0, p0, Lq$b;->j:I

    iget-object v1, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, v1, v3

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->canApplyTheme()Z

    move-result v4

    if-eqz v4, :cond_1

    return v5

    :cond_0
    iget-object v4, p0, Lq$b;->h:Landroid/util/SparseArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable$ConstantState;->canApplyTheme()Z

    move-result v4

    if-eqz v4, :cond_1

    return v5

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method final d()V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq$b;->o:Z

    invoke-virtual {p0}, Lq$b;->c()V

    iget v0, p0, Lq$b;->j:I

    iget-object v1, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    const/4 v2, -0x1

    iput v2, p0, Lq$b;->q:I

    iput v2, p0, Lq$b;->p:I

    const/4 v2, 0x0

    iput v2, p0, Lq$b;->s:I

    iput v2, p0, Lq$b;->r:I

    :goto_0
    if-ge v2, v0, :cond_4

    aget-object v3, v1, v2

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    iget v5, p0, Lq$b;->p:I

    if-le v4, v5, :cond_0

    iput v4, p0, Lq$b;->p:I

    :cond_0
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    iget v5, p0, Lq$b;->q:I

    if-le v4, v5, :cond_1

    iput v4, p0, Lq$b;->q:I

    :cond_1
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v4

    iget v5, p0, Lq$b;->r:I

    if-le v4, v5, :cond_2

    iput v4, p0, Lq$b;->r:I

    :cond_2
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v3

    iget v4, p0, Lq$b;->s:I

    if-le v3, v4, :cond_3

    iput v3, p0, Lq$b;->s:I

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final declared-synchronized e()Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lq$b;->x:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lq$b;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lq$b;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq$b;->x:Z

    iget v1, p0, Lq$b;->j:I

    iget-object v2, p0, Lq$b;->i:[Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_2

    aget-object v5, v2, v4

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v5

    if-nez v5, :cond_1

    iput-boolean v3, p0, Lq$b;->y:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    :try_start_2
    iput-boolean v0, p0, Lq$b;->y:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getChangingConfigurations()I
    .locals 2

    iget v0, p0, Lq$b;->f:I

    iget v1, p0, Lq$b;->g:I

    or-int/2addr v0, v1

    return v0
.end method
