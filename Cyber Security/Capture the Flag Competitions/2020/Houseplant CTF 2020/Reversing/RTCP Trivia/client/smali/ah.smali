.class public final Lah;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Laq;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lah$a;
    }
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field public b:Landroid/view/LayoutInflater;

.field c:Laj;

.field public d:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field e:I

.field f:I

.field g:I

.field public h:Laq$a;

.field public i:Lah$a;


# direct methods
.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lah;->g:I

    const/4 p1, 0x0

    iput p1, p0, Lah;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    invoke-direct {p0, p2}, Lah;-><init>(I)V

    iput-object p1, p0, Lah;->a:Landroid/content/Context;

    iget-object p1, p0, Lah;->a:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lah;->b:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public final a(Laj;Z)V
    .locals 1

    iget-object v0, p0, Lah;->h:Laq$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lah;->h:Laq$a;

    invoke-interface {v0, p1, p2}, Laq$a;->a(Laj;Z)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/content/Context;Laj;)V
    .locals 2

    iget v0, p0, Lah;->f:I

    if-eqz v0, :cond_0

    new-instance v0, Landroid/view/ContextThemeWrapper;

    iget v1, p0, Lah;->f:I

    invoke-direct {v0, p1, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lah;->a:Landroid/content/Context;

    :goto_0
    iget-object p1, p0, Lah;->a:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lah;->b:Landroid/view/LayoutInflater;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lah;->a:Landroid/content/Context;

    if-eqz v0, :cond_1

    iput-object p1, p0, Lah;->a:Landroid/content/Context;

    iget-object p1, p0, Lah;->b:Landroid/view/LayoutInflater;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    iput-object p2, p0, Lah;->c:Laj;

    iget-object p1, p0, Lah;->i:Lah$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lah;->i:Lah$a;

    invoke-virtual {p1}, Lah$a;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method

.method public final a(Laq$a;)V
    .locals 0

    iput-object p1, p0, Lah;->h:Laq$a;

    return-void
.end method

.method public final a(Z)V
    .locals 0

    iget-object p1, p0, Lah;->i:Lah$a;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lah;->i:Lah$a;

    invoke-virtual {p1}, Lah$a;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a(Law;)Z
    .locals 6

    invoke-virtual {p1}, Law;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lak;

    invoke-direct {v0, p1}, Lak;-><init>(Laj;)V

    iget-object v1, v0, Lak;->a:Laj;

    new-instance v2, Ld$a;

    iget-object v3, v1, Laj;->a:Landroid/content/Context;

    invoke-direct {v2, v3}, Ld$a;-><init>(Landroid/content/Context;)V

    new-instance v3, Lah;

    iget-object v4, v2, Ld$a;->a:Landroidx/appcompat/app/AlertController$a;

    iget-object v4, v4, Landroidx/appcompat/app/AlertController$a;->a:Landroid/content/Context;

    sget v5, Lb$g;->abc_list_menu_item_layout:I

    invoke-direct {v3, v4, v5}, Lah;-><init>(Landroid/content/Context;I)V

    iput-object v3, v0, Lak;->c:Lah;

    iget-object v3, v0, Lak;->c:Lah;

    iput-object v0, v3, Lah;->h:Laq$a;

    iget-object v3, v0, Lak;->a:Laj;

    iget-object v4, v0, Lak;->c:Lah;

    invoke-virtual {v3, v4}, Laj;->a(Laq;)V

    iget-object v3, v0, Lak;->c:Lah;

    invoke-virtual {v3}, Lah;->b()Landroid/widget/ListAdapter;

    move-result-object v3

    iget-object v4, v2, Ld$a;->a:Landroidx/appcompat/app/AlertController$a;

    iput-object v3, v4, Landroidx/appcompat/app/AlertController$a;->w:Landroid/widget/ListAdapter;

    iget-object v3, v2, Ld$a;->a:Landroidx/appcompat/app/AlertController$a;

    iput-object v0, v3, Landroidx/appcompat/app/AlertController$a;->x:Landroid/content/DialogInterface$OnClickListener;

    iget-object v3, v1, Laj;->h:Landroid/view/View;

    if-eqz v3, :cond_1

    iget-object v1, v2, Ld$a;->a:Landroidx/appcompat/app/AlertController$a;

    iput-object v3, v1, Landroidx/appcompat/app/AlertController$a;->g:Landroid/view/View;

    goto :goto_0

    :cond_1
    iget-object v3, v1, Laj;->g:Landroid/graphics/drawable/Drawable;

    iget-object v4, v2, Ld$a;->a:Landroidx/appcompat/app/AlertController$a;

    iput-object v3, v4, Landroidx/appcompat/app/AlertController$a;->d:Landroid/graphics/drawable/Drawable;

    iget-object v1, v1, Laj;->f:Ljava/lang/CharSequence;

    iget-object v3, v2, Ld$a;->a:Landroidx/appcompat/app/AlertController$a;

    iput-object v1, v3, Landroidx/appcompat/app/AlertController$a;->f:Ljava/lang/CharSequence;

    :goto_0
    iget-object v1, v2, Ld$a;->a:Landroidx/appcompat/app/AlertController$a;

    iput-object v0, v1, Landroidx/appcompat/app/AlertController$a;->u:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v2}, Ld$a;->a()Ld;

    move-result-object v1

    iput-object v1, v0, Lak;->b:Ld;

    iget-object v1, v0, Lak;->b:Ld;

    invoke-virtual {v1, v0}, Ld;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v0, Lak;->b:Ld;

    invoke-virtual {v1}, Ld;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/16 v2, 0x3eb

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v3, 0x20000

    or-int/2addr v2, v3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, v0, Lak;->b:Ld;

    invoke-virtual {v0}, Ld;->show()V

    iget-object v0, p0, Lah;->h:Laq$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lah;->h:Laq$a;

    invoke-interface {v0, p1}, Laq$a;->a(Laj;)Z

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final b()Landroid/widget/ListAdapter;
    .locals 1

    iget-object v0, p0, Lah;->i:Lah$a;

    if-nez v0, :cond_0

    new-instance v0, Lah$a;

    invoke-direct {v0, p0}, Lah$a;-><init>(Lah;)V

    iput-object v0, p0, Lah;->i:Lah$a;

    :cond_0
    iget-object v0, p0, Lah;->i:Lah$a;

    return-object v0
.end method

.method public final b(Lal;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lal;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lah;->c:Laj;

    iget-object p2, p0, Lah;->i:Lah$a;

    invoke-virtual {p2, p3}, Lah$a;->a(I)Lal;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Laj;->a(Landroid/view/MenuItem;Laq;I)Z

    return-void
.end method
