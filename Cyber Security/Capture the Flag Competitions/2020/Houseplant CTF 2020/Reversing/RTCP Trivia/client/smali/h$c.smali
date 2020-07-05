.class final Lh$c;
.super Lab;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lh;


# direct methods
.method constructor <init>(Lh;Landroid/view/Window$Callback;)V
    .locals 0

    iput-object p1, p0, Lh$c;->a:Lh;

    invoke-direct {p0, p2}, Lab;-><init>(Landroid/view/Window$Callback;)V

    return-void
.end method

.method private a(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 9

    new-instance v0, Ly$a;

    iget-object v1, p0, Lh$c;->a:Lh;

    iget-object v1, v1, Lh;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Ly$a;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    iget-object p1, p0, Lh$c;->a:Lh;

    iget-object v1, p1, Lh;->i:Lu;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lh;->i:Lu;

    invoke-virtual {v1}, Lu;->c()V

    :cond_0
    new-instance v1, Lh$b;

    invoke-direct {v1, p1, v0}, Lh$b;-><init>(Lh;Lu$a;)V

    invoke-virtual {p1}, Lh;->a()Lc;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Lc;->a(Lu$a;)Lu;

    move-result-object v2

    iput-object v2, p1, Lh;->i:Lu;

    :cond_1
    iget-object v2, p1, Lh;->i:Lu;

    const/4 v3, 0x0

    if-nez v2, :cond_b

    invoke-virtual {p1}, Lh;->m()V

    iget-object v2, p1, Lh;->i:Lu;

    if-eqz v2, :cond_2

    iget-object v2, p1, Lh;->i:Lu;

    invoke-virtual {v2}, Lu;->c()V

    :cond_2
    iget-object v2, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v2, :cond_5

    iget-boolean v2, p1, Lh;->s:Z

    if-eqz v2, :cond_4

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    iget-object v6, p1, Lh;->b:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    sget v7, Lb$a;->actionBarTheme:I

    invoke-virtual {v6, v7, v2, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v7, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v7, :cond_3

    iget-object v7, p1, Lh;->b:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v6, v2, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v7, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v6, Lw;

    iget-object v8, p1, Lh;->b:Landroid/content/Context;

    invoke-direct {v6, v8, v4}, Lw;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    goto :goto_0

    :cond_3
    iget-object v6, p1, Lh;->b:Landroid/content/Context;

    :goto_0
    new-instance v7, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {v7, v6}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v7, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    new-instance v7, Landroid/widget/PopupWindow;

    sget v8, Lb$a;->actionModePopupWindowStyle:I

    invoke-direct {v7, v6, v3, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v7, p1, Lh;->k:Landroid/widget/PopupWindow;

    iget-object v7, p1, Lh;->k:Landroid/widget/PopupWindow;

    const/4 v8, 0x2

    invoke-static {v7, v8}, Lhf;->a(Landroid/widget/PopupWindow;I)V

    iget-object v7, p1, Lh;->k:Landroid/widget/PopupWindow;

    iget-object v8, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v7, v8}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v7, p1, Lh;->k:Landroid/widget/PopupWindow;

    const/4 v8, -0x1

    invoke-virtual {v7, v8}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    sget v8, Lb$a;->actionBarSize:I

    invoke-virtual {v7, v8, v2, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v2, v2, Landroid/util/TypedValue;->data:I

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v2

    iget-object v6, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object v2, p1, Lh;->k:Landroid/widget/PopupWindow;

    const/4 v6, -0x2

    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance v2, Lh$6;

    invoke-direct {v2, p1}, Lh$6;-><init>(Lh;)V

    iput-object v2, p1, Lh;->l:Ljava/lang/Runnable;

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lh;->o:Landroid/view/ViewGroup;

    sget v6, Lb$f;->action_mode_bar_stub:I

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lh;->k()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {v2}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v2, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    :cond_5
    :goto_1
    iget-object v2, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v2, :cond_a

    invoke-virtual {p1}, Lh;->m()V

    iget-object v2, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->b()V

    new-instance v2, Lx;

    iget-object v6, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v6

    iget-object v7, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v8, p1, Lh;->k:Landroid/widget/PopupWindow;

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    move v5, v4

    :goto_2
    invoke-direct {v2, v6, v7, v1, v5}, Lx;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lu$a;Z)V

    invoke-virtual {v2}, Lu;->b()Landroid/view/Menu;

    move-result-object v5

    invoke-interface {v1, v2, v5}, Lu$a;->a(Lu;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v2}, Lu;->d()V

    iget-object v1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->a(Lu;)V

    iput-object v2, p1, Lh;->i:Lu;

    invoke-virtual {p1}, Lh;->l()Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_7

    iget-object v1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/ActionBarContextView;->setAlpha(F)V

    iget-object v1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v1}, Lgq;->d(Landroid/view/View;)Lgt;

    move-result-object v1

    invoke-virtual {v1, v2}, Lgt;->a(F)Lgt;

    move-result-object v1

    iput-object v1, p1, Lh;->m:Lgt;

    iget-object v1, p1, Lh;->m:Lgt;

    new-instance v2, Lh$7;

    invoke-direct {v2, p1}, Lh$7;-><init>(Lh;)V

    invoke-virtual {v1, v2}, Lgt;->a(Lgu;)Lgt;

    goto :goto_3

    :cond_7
    iget-object v1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setAlpha(F)V

    iget-object v1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object v1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->sendAccessibilityEvent(I)V

    iget-object v1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_8

    iget-object v1, p1, Lh;->j:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Lgq;->g(Landroid/view/View;)V

    :cond_8
    :goto_3
    iget-object v1, p1, Lh;->k:Landroid/widget/PopupWindow;

    if-eqz v1, :cond_a

    iget-object v1, p1, Lh;->c:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p1, Lh;->l:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    :cond_9
    iput-object v3, p1, Lh;->i:Lu;

    :cond_a
    :goto_4
    iget-object v1, p1, Lh;->i:Lu;

    iput-object v1, p1, Lh;->i:Lu;

    :cond_b
    iget-object p1, p1, Lh;->i:Lu;

    if-eqz p1, :cond_c

    invoke-virtual {v0, p1}, Ly$a;->b(Lu;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    :cond_c
    return-object v3
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lh$c;->a:Lh;

    invoke-virtual {v0, p1}, Lh;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Lab;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-super {p0, p1}, Lab;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lh$c;->a:Lh;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lh;->a(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onContentChanged()V
    .locals 0

    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    if-nez p1, :cond_0

    instance-of v0, p2, Laj;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Lab;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 2

    invoke-super {p0, p1, p2}, Lab;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p2, p0, Lh$c;->a:Lh;

    const/4 v0, 0x1

    const/16 v1, 0x6c

    if-ne p1, v1, :cond_0

    invoke-virtual {p2}, Lh;->a()Lc;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lc;->c(Z)V

    :cond_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lab;->onPanelClosed(ILandroid/view/Menu;)V

    iget-object p2, p0, Lh$c;->a:Lh;

    invoke-virtual {p2, p1}, Lh;->d(I)V

    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    instance-of v0, p3, Laj;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Laj;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    if-nez v0, :cond_1

    return v1

    :cond_1
    if-eqz v0, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, v0, Laj;->k:Z

    :cond_2
    invoke-super {p0, p1, p2, p3}, Lab;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz v0, :cond_3

    iput-boolean v1, v0, Laj;->k:Z

    :cond_3
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/KeyboardShortcutGroup;",
            ">;",
            "Landroid/view/Menu;",
            "I)V"
        }
    .end annotation

    iget-object v0, p0, Lh$c;->a:Lh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh;->e(I)Lh$f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Lh$f;->j:Laj;

    if-eqz v1, :cond_0

    iget-object p2, v0, Lh$f;->j:Laj;

    invoke-super {p0, p1, p2, p3}, Lab;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lab;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V

    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lh$c;->a:Lh;

    iget-boolean v0, v0, Lh;->n:Z

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lh$c;->a(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-super {p0, p1}, Lab;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 1

    iget-object v0, p0, Lh$c;->a:Lh;

    iget-boolean v0, v0, Lh;->n:Z

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lh$c;->a(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Lab;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method
