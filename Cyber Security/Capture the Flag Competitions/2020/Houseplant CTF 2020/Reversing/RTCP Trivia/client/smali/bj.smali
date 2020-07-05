.class public final Lbj;
.super Landroid/widget/EditText;

# interfaces
.implements Lgp;


# instance fields
.field private final a:Lbd;

.field private final b:Lbw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lb$a;->editTextStyle:I

    invoke-direct {p0, p1, p2, v0}, Lbj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, Lco;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lbd;

    invoke-direct {p1, p0}, Lbd;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lbj;->a:Lbd;

    iget-object p1, p0, Lbj;->a:Lbd;

    invoke-virtual {p1, p2, p3}, Lbd;->a(Landroid/util/AttributeSet;I)V

    new-instance p1, Lbw;

    invoke-direct {p1, p0}, Lbw;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lbj;->b:Lbw;

    iget-object p1, p0, Lbj;->b:Lbw;

    invoke-virtual {p1, p2, p3}, Lbw;->a(Landroid/util/AttributeSet;I)V

    iget-object p1, p0, Lbj;->b:Lbw;

    invoke-virtual {p1}, Lbw;->a()V

    return-void
.end method


# virtual methods
.method protected final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/EditText;->drawableStateChanged()V

    iget-object v0, p0, Lbj;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj;->a:Lbd;

    invoke-virtual {v0}, Lbd;->d()V

    :cond_0
    iget-object v0, p0, Lbj;->b:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbj;->b:Lbw;

    invoke-virtual {v0}, Lbw;->a()V

    :cond_1
    return-void
.end method

.method public final getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lbj;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj;->a:Lbd;

    invoke-virtual {v0}, Lbd;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lbj;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj;->a:Lbd;

    invoke-virtual {v0}, Lbd;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getText()Landroid/text/Editable;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getText()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Lbj;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/EditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lbk;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lbj;->a:Lbd;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbj;->a:Lbd;

    invoke-virtual {p1}, Lbd;->a()V

    :cond_0
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    iget-object v0, p0, Lbj;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(I)V

    :cond_0
    return-void
.end method

.method public final setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Lhg;->a(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/EditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public final setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lbj;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public final setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lbj;->a:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj;->a:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lbj;->b:Lbw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj;->b:Lbw;

    invoke-virtual {v0, p1, p2}, Lbw;->a(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
