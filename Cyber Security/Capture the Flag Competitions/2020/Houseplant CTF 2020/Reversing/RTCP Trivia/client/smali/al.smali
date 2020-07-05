.class public final Lal;
.super Ljava/lang/Object;

# interfaces
.implements Lft;


# instance fields
.field private A:Z

.field private B:I

.field private C:Landroid/view/View;

.field private D:Landroid/view/MenuItem$OnActionExpandListener;

.field private E:Z

.field final a:I

.field public b:I

.field public c:I

.field public d:Laj;

.field public e:I

.field public f:Lge;

.field g:Landroid/view/ContextMenu$ContextMenuInfo;

.field private final h:I

.field private final i:I

.field private final j:I

.field private k:Ljava/lang/CharSequence;

.field private l:Ljava/lang/CharSequence;

.field private m:Landroid/content/Intent;

.field private n:C

.field private o:C

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:I

.field private r:Law;

.field private s:Ljava/lang/Runnable;

.field private t:Landroid/view/MenuItem$OnMenuItemClickListener;

.field private u:Ljava/lang/CharSequence;

.field private v:Ljava/lang/CharSequence;

.field private w:Landroid/content/res/ColorStateList;

.field private x:Landroid/graphics/PorterDuff$Mode;

.field private y:Z

.field private z:Z


# direct methods
.method constructor <init>(Laj;IIIILjava/lang/CharSequence;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    iput v0, p0, Lal;->b:I

    iput v0, p0, Lal;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lal;->q:I

    const/4 v1, 0x0

    iput-object v1, p0, Lal;->w:Landroid/content/res/ColorStateList;

    iput-object v1, p0, Lal;->x:Landroid/graphics/PorterDuff$Mode;

    iput-boolean v0, p0, Lal;->y:Z

    iput-boolean v0, p0, Lal;->z:Z

    iput-boolean v0, p0, Lal;->A:Z

    const/16 v1, 0x10

    iput v1, p0, Lal;->B:I

    iput v0, p0, Lal;->e:I

    iput-boolean v0, p0, Lal;->E:Z

    iput-object p1, p0, Lal;->d:Laj;

    iput p3, p0, Lal;->h:I

    iput p2, p0, Lal;->i:I

    iput p4, p0, Lal;->j:I

    iput p5, p0, Lal;->a:I

    iput-object p6, p0, Lal;->k:Ljava/lang/CharSequence;

    iput p7, p0, Lal;->e:I

    return-void
.end method

.method private a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    if-eqz p1, :cond_3

    iget-boolean v0, p0, Lal;->A:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lal;->y:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lal;->z:Z

    if-eqz v0, :cond_3

    :cond_0
    invoke-static {p1}, Lfn;->d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-boolean v0, p0, Lal;->y:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lal;->w:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Lfn;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v0, p0, Lal;->z:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lal;->x:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, Lfn;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lal;->A:Z

    :cond_3
    return-object p1
.end method

.method private a(Landroid/view/View;)Lft;
    .locals 2

    iput-object p1, p0, Lal;->C:Landroid/view/View;

    const/4 v0, 0x0

    iput-object v0, p0, Lal;->f:Lge;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lal;->h:I

    if-lez v0, :cond_0

    iget v0, p0, Lal;->h:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    :cond_0
    iget-object p1, p0, Lal;->d:Laj;

    invoke-virtual {p1}, Laj;->h()V

    return-object p0
.end method

.method public static a(Ljava/lang/StringBuilder;IILjava/lang/String;)V
    .locals 0

    and-int/2addr p1, p2

    if-ne p1, p2, :cond_0

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method private e(Z)V
    .locals 3

    iget v0, p0, Lal;->B:I

    iget v1, p0, Lal;->B:I

    and-int/lit8 v1, v1, -0x3

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    or-int/2addr p1, v1

    iput p1, p0, Lal;->B:I

    iget p1, p0, Lal;->B:I

    if-eq v0, p1, :cond_1

    iget-object p1, p0, Lal;->d:Laj;

    invoke-virtual {p1, v2}, Laj;->b(Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lge;)Lft;
    .locals 2

    iget-object v0, p0, Lal;->f:Lge;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal;->f:Lge;

    iput-object v1, v0, Lge;->f:Lge$b;

    iput-object v1, v0, Lge;->e:Lge$a;

    :cond_0
    iput-object v1, p0, Lal;->C:Landroid/view/View;

    iput-object p1, p0, Lal;->f:Lge;

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    iget-object p1, p0, Lal;->f:Lge;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lal;->f:Lge;

    new-instance v0, Lal$1;

    invoke-direct {v0, p0}, Lal$1;-><init>(Lal;)V

    invoke-virtual {p1, v0}, Lge;->a(Lge$b;)V

    :cond_1
    return-object p0
.end method

.method public final a(Ljava/lang/CharSequence;)Lft;
    .locals 1

    iput-object p1, p0, Lal;->u:Ljava/lang/CharSequence;

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final a()Lge;
    .locals 1

    iget-object v0, p0, Lal;->f:Lge;

    return-object v0
.end method

.method public final a(Lar$a;)Ljava/lang/CharSequence;
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lar$a;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lal;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lal;->getTitle()Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final a(Law;)V
    .locals 1

    iput-object p1, p0, Lal;->r:Law;

    invoke-virtual {p0}, Lal;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Law;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget v0, p0, Lal;->B:I

    and-int/lit8 v0, v0, -0x5

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v0

    iput p1, p0, Lal;->B:I

    return-void
.end method

.method public final b(Ljava/lang/CharSequence;)Lft;
    .locals 1

    iput-object p1, p0, Lal;->v:Ljava/lang/CharSequence;

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final b()Z
    .locals 4

    iget-object v0, p0, Lal;->t:Landroid/view/MenuItem$OnMenuItemClickListener;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal;->t:Landroid/view/MenuItem$OnMenuItemClickListener;

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lal;->d:Laj;

    iget-object v2, p0, Lal;->d:Laj;

    invoke-virtual {v0, v2, p0}, Laj;->a(Laj;Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lal;->s:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lal;->s:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return v1

    :cond_2
    iget-object v0, p0, Lal;->m:Landroid/content/Intent;

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lal;->d:Laj;

    iget-object v0, v0, Laj;->a:Landroid/content/Context;

    iget-object v2, p0, Lal;->m:Landroid/content/Intent;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception v0

    const-string v2, "MenuItemImpl"

    const-string v3, "Can\'t find activity to handle intent; ignoring"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    iget-object v0, p0, Lal;->f:Lge;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lal;->f:Lge;

    invoke-virtual {v0}, Lge;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method final b(Z)Z
    .locals 3

    iget v0, p0, Lal;->B:I

    iget v1, p0, Lal;->B:I

    and-int/lit8 v1, v1, -0x9

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    or-int/2addr p1, v1

    iput p1, p0, Lal;->B:I

    iget p1, p0, Lal;->B:I

    if-eq v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method

.method public final c()C
    .locals 1

    iget-object v0, p0, Lal;->d:Laj;

    invoke-virtual {v0}, Laj;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-char v0, p0, Lal;->o:C

    return v0

    :cond_0
    iget-char v0, p0, Lal;->n:C

    return v0
.end method

.method public final c(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lal;->B:I

    or-int/lit8 p1, p1, 0x20

    :goto_0
    iput p1, p0, Lal;->B:I

    return-void

    :cond_0
    iget p1, p0, Lal;->B:I

    and-int/lit8 p1, p1, -0x21

    goto :goto_0
.end method

.method public final collapseActionView()Z
    .locals 2

    iget v0, p0, Lal;->e:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lal;->C:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    iget-object v0, p0, Lal;->D:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lal;->D:Landroid/view/MenuItem$OnActionExpandListener;

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    iget-object v0, p0, Lal;->d:Laj;

    invoke-virtual {v0, p0}, Laj;->b(Lal;)Z

    move-result v0

    return v0
.end method

.method public final d(Z)V
    .locals 1

    iput-boolean p1, p0, Lal;->E:Z

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lal;->d:Laj;

    invoke-virtual {v0}, Laj;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lal;->c()C

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 1

    iget v0, p0, Lal;->B:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final expandActionView()Z
    .locals 2

    invoke-virtual {p0}, Lal;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lal;->D:Landroid/view/MenuItem$OnActionExpandListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lal;->D:Landroid/view/MenuItem$OnActionExpandListener;

    invoke-interface {v0, p0}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    iget-object v0, p0, Lal;->d:Laj;

    invoke-virtual {v0, p0}, Laj;->a(Lal;)Z

    move-result v0

    return v0
.end method

.method public final f()Z
    .locals 2

    iget v0, p0, Lal;->B:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 2

    iget v0, p0, Lal;->e:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is not supported, use MenuItemCompat.getActionProvider()"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getActionView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lal;->C:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal;->C:Landroid/view/View;

    return-object v0

    :cond_0
    iget-object v0, p0, Lal;->f:Lge;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lal;->f:Lge;

    invoke-virtual {v0, p0}, Lge;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lal;->C:Landroid/view/View;

    iget-object v0, p0, Lal;->C:Landroid/view/View;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getAlphabeticModifiers()I
    .locals 1

    iget v0, p0, Lal;->c:I

    return v0
.end method

.method public final getAlphabeticShortcut()C
    .locals 1

    iget-char v0, p0, Lal;->o:C

    return v0
.end method

.method public final getContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lal;->u:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getGroupId()I
    .locals 1

    iget v0, p0, Lal;->i:I

    return v0
.end method

.method public final getIcon()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lal;->p:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal;->p:Landroid/graphics/drawable/Drawable;

    :goto_0
    invoke-direct {p0, v0}, Lal;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_0
    iget v0, p0, Lal;->q:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lal;->d:Laj;

    iget-object v0, v0, Laj;->a:Landroid/content/Context;

    iget v1, p0, Lal;->q:I

    invoke-static {v0, v1}, Lo;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, p0, Lal;->q:I

    iput-object v0, p0, Lal;->p:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lal;->w:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lal;->x:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public final getIntent()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lal;->m:Landroid/content/Intent;

    return-object v0
.end method

.method public final getItemId()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    iget v0, p0, Lal;->h:I

    return v0
.end method

.method public final getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    iget-object v0, p0, Lal;->g:Landroid/view/ContextMenu$ContextMenuInfo;

    return-object v0
.end method

.method public final getNumericModifiers()I
    .locals 1

    iget v0, p0, Lal;->b:I

    return v0
.end method

.method public final getNumericShortcut()C
    .locals 1

    iget-char v0, p0, Lal;->n:C

    return v0
.end method

.method public final getOrder()I
    .locals 1

    iget v0, p0, Lal;->j:I

    return v0
.end method

.method public final getSubMenu()Landroid/view/SubMenu;
    .locals 1

    iget-object v0, p0, Lal;->r:Law;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    iget-object v0, p0, Lal;->k:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getTitleCondensed()Ljava/lang/CharSequence;
    .locals 3

    iget-object v0, p0, Lal;->l:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal;->l:Ljava/lang/CharSequence;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lal;->k:Ljava/lang/CharSequence;

    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x12

    if-ge v1, v2, :cond_1

    if-eqz v0, :cond_1

    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final getTooltipText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lal;->v:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    iget v0, p0, Lal;->e:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasSubMenu()Z
    .locals 1

    iget-object v0, p0, Lal;->r:Law;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final i()Z
    .locals 2

    iget v0, p0, Lal;->e:I

    and-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lal;->C:Landroid/view/View;

    if-nez v0, :cond_0

    iget-object v0, p0, Lal;->f:Lge;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal;->f:Lge;

    invoke-virtual {v0, p0}, Lge;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lal;->C:Landroid/view/View;

    :cond_0
    iget-object v0, p0, Lal;->C:Landroid/view/View;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final isActionViewExpanded()Z
    .locals 1

    iget-boolean v0, p0, Lal;->E:Z

    return v0
.end method

.method public final isCheckable()Z
    .locals 2

    iget v0, p0, Lal;->B:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isChecked()Z
    .locals 2

    iget v0, p0, Lal;->B:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    iget v0, p0, Lal;->B:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isVisible()Z
    .locals 3

    iget-object v0, p0, Lal;->f:Lge;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lal;->f:Lge;

    invoke-virtual {v0}, Lge;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lal;->B:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

    iget-object v0, p0, Lal;->f:Lge;

    invoke-virtual {v0}, Lge;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    iget v0, p0, Lal;->B:I

    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This is not supported, use MenuItemCompat.setActionProvider()"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic setActionView(I)Landroid/view/MenuItem;
    .locals 3

    iget-object v0, p0, Lal;->d:Laj;

    iget-object v0, v0, Laj;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    invoke-virtual {v1, p1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lal;->a(Landroid/view/View;)Lft;

    return-object p0
.end method

.method public final synthetic setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 0

    invoke-direct {p0, p1}, Lal;->a(Landroid/view/View;)Lft;

    move-result-object p1

    return-object p1
.end method

.method public final setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 1

    iget-char v0, p0, Lal;->o:C

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lal;->o:C

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setAlphabeticShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    iget-char v0, p0, Lal;->o:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Lal;->c:I

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lal;->o:C

    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lal;->c:I

    iget-object p1, p0, Lal;->d:Laj;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setCheckable(Z)Landroid/view/MenuItem;
    .locals 2

    iget v0, p0, Lal;->B:I

    iget v1, p0, Lal;->B:I

    and-int/lit8 v1, v1, -0x2

    or-int/2addr p1, v1

    iput p1, p0, Lal;->B:I

    iget p1, p0, Lal;->B:I

    if-eq v0, p1, :cond_0

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    :cond_0
    return-object p0
.end method

.method public final setChecked(Z)Landroid/view/MenuItem;
    .locals 6

    iget v0, p0, Lal;->B:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    iget-object p1, p0, Lal;->d:Laj;

    invoke-interface {p0}, Landroid/view/MenuItem;->getGroupId()I

    move-result v0

    iget-object v1, p1, Laj;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1}, Laj;->e()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    iget-object v4, p1, Laj;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lal;

    invoke-virtual {v4}, Lal;->getGroupId()I

    move-result v5

    if-ne v5, v0, :cond_1

    invoke-virtual {v4}, Lal;->e()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lal;->isCheckable()Z

    move-result v5

    if-eqz v5, :cond_1

    if-ne v4, p0, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    invoke-direct {v4, v5}, Lal;->e(Z)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Laj;->f()V

    return-object p0

    :cond_3
    invoke-direct {p0, p1}, Lal;->e(Z)V

    return-object p0
.end method

.method public final synthetic setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lal;->a(Ljava/lang/CharSequence;)Lft;

    move-result-object p1

    return-object p1
.end method

.method public final setEnabled(Z)Landroid/view/MenuItem;
    .locals 1

    if-eqz p1, :cond_0

    iget p1, p0, Lal;->B:I

    or-int/lit8 p1, p1, 0x10

    :goto_0
    iput p1, p0, Lal;->B:I

    goto :goto_1

    :cond_0
    iget p1, p0, Lal;->B:I

    and-int/lit8 p1, p1, -0x11

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lal;->p:Landroid/graphics/drawable/Drawable;

    iput p1, p0, Lal;->q:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lal;->A:Z

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lal;->q:I

    iput-object p1, p0, Lal;->p:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lal;->A:Z

    iget-object p1, p0, Lal;->d:Laj;

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lal;->w:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lal;->y:Z

    iput-boolean p1, p0, Lal;->A:Z

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lal;->x:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lal;->z:Z

    iput-boolean p1, p0, Lal;->A:Z

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lal;->m:Landroid/content/Intent;

    return-object p0
.end method

.method public final setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 1

    iget-char v0, p0, Lal;->n:C

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    iput-char p1, p0, Lal;->n:C

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setNumericShortcut(CI)Landroid/view/MenuItem;
    .locals 1

    iget-char v0, p0, Lal;->n:C

    if-ne v0, p1, :cond_0

    iget v0, p0, Lal;->b:I

    if-ne v0, p2, :cond_0

    return-object p0

    :cond_0
    iput-char p1, p0, Lal;->n:C

    invoke-static {p2}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lal;->b:I

    iget-object p1, p0, Lal;->d:Laj;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lal;->D:Landroid/view/MenuItem$OnActionExpandListener;

    return-object p0
.end method

.method public final setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 0

    iput-object p1, p0, Lal;->t:Landroid/view/MenuItem$OnMenuItemClickListener;

    return-object p0
.end method

.method public final setShortcut(CC)Landroid/view/MenuItem;
    .locals 0

    iput-char p1, p0, Lal;->n:C

    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lal;->o:C

    iget-object p1, p0, Lal;->d:Laj;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setShortcut(CCII)Landroid/view/MenuItem;
    .locals 0

    iput-char p1, p0, Lal;->n:C

    invoke-static {p3}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lal;->b:I

    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    iput-char p1, p0, Lal;->o:C

    invoke-static {p4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result p1

    iput p1, p0, Lal;->c:I

    iget-object p1, p0, Lal;->d:Laj;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Laj;->b(Z)V

    return-object p0
.end method

.method public final setShowAsAction(I)V
    .locals 1

    and-int/lit8 v0, p1, 0x3

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iput p1, p0, Lal;->e:I

    iget-object p1, p0, Lal;->d:Laj;

    invoke-virtual {p1}, Laj;->h()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lal;->setShowAsAction(I)V

    return-object p0
.end method

.method public final setTitle(I)Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lal;->d:Laj;

    iget-object v0, v0, Laj;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lal;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 2

    iput-object p1, p0, Lal;->k:Ljava/lang/CharSequence;

    iget-object v0, p0, Lal;->d:Laj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Laj;->b(Z)V

    iget-object v0, p0, Lal;->r:Law;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal;->r:Law;

    invoke-virtual {v0, p1}, Law;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    :cond_0
    return-object p0
.end method

.method public final setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    iput-object p1, p0, Lal;->l:Ljava/lang/CharSequence;

    iget-object p1, p0, Lal;->d:Laj;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Laj;->b(Z)V

    return-object p0
.end method

.method public final synthetic setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lal;->b(Ljava/lang/CharSequence;)Lft;

    move-result-object p1

    return-object p1
.end method

.method public final setVisible(Z)Landroid/view/MenuItem;
    .locals 0

    invoke-virtual {p0, p1}, Lal;->b(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lal;->d:Laj;

    invoke-virtual {p1}, Laj;->g()V

    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lal;->k:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lal;->k:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
