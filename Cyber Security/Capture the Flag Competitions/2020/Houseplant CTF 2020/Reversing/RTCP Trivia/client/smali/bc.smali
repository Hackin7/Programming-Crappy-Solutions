.class public Lbc;
.super Landroid/widget/AutoCompleteTextView;

# interfaces
.implements Lgp;


# static fields
.field private static final a:[I


# instance fields
.field private final b:Lbd;

.field private final c:Lbw;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010176

    aput v2, v0, v1

    sput-object v0, Lbc;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lbc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget v0, Lb$a;->autoCompleteTextViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lbc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-static {p1}, Lco;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Lbc;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lbc;->a:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lcr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcr;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcr;->f(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbc;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object p1, p1, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p1, Lbd;

    invoke-direct {p1, p0}, Lbd;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lbc;->b:Lbd;

    iget-object p1, p0, Lbc;->b:Lbd;

    invoke-virtual {p1, p2, p3}, Lbd;->a(Landroid/util/AttributeSet;I)V

    new-instance p1, Lbw;

    invoke-direct {p1, p0}, Lbw;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lbc;->c:Lbw;

    iget-object p1, p0, Lbc;->c:Lbw;

    invoke-virtual {p1, p2, p3}, Lbw;->a(Landroid/util/AttributeSet;I)V

    iget-object p1, p0, Lbc;->c:Lbw;

    invoke-virtual {p1}, Lbw;->a()V

    return-void
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->drawableStateChanged()V

    iget-object v0, p0, Lbc;->b:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbc;->b:Lbd;

    invoke-virtual {v0}, Lbd;->d()V

    :cond_0
    iget-object v0, p0, Lbc;->c:Lbw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbc;->c:Lbw;

    invoke-virtual {v0}, Lbw;->a()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lbc;->b:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbc;->b:Lbd;

    invoke-virtual {v0}, Lbd;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lbc;->b:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbc;->b:Lbd;

    invoke-virtual {v0}, Lbd;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lbk;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lbc;->b:Lbd;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbc;->b:Lbd;

    invoke-virtual {p1}, Lbd;->a()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundResource(I)V

    iget-object v0, p0, Lbc;->b:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbc;->b:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(I)V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Lhg;->a(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setDropDownBackgroundResource(I)V
    .locals 1

    invoke-virtual {p0}, Lbc;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbc;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lbc;->b:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbc;->b:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lbc;->b:Lbd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbc;->b:Lbd;

    invoke-virtual {v0, p1}, Lbd;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/AutoCompleteTextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lbc;->c:Lbw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbc;->c:Lbw;

    invoke-virtual {v0, p1, p2}, Lbw;->a(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
