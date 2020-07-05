.class public final Lbg;
.super Landroid/widget/CheckedTextView;


# static fields
.field private static final a:[I


# instance fields
.field private final b:Lbw;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010108

    aput v2, v0, v1

    sput-object v0, Lbg;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lbg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V
    .locals 2

    invoke-static {p1}, Lco;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    const p3, 0x10103c8

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckedTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Lbw;

    invoke-direct {p1, p0}, Lbw;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lbg;->b:Lbw;

    iget-object p1, p0, Lbg;->b:Lbw;

    invoke-virtual {p1, p2, p3}, Lbw;->a(Landroid/util/AttributeSet;I)V

    iget-object p1, p0, Lbg;->b:Lbw;

    invoke-virtual {p1}, Lbw;->a()V

    invoke-virtual {p0}, Lbg;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lbg;->a:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lcr;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lcr;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcr;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Lbg;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p1, Lcr;->b:Landroid/content/res/TypedArray;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method protected final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/CheckedTextView;->drawableStateChanged()V

    iget-object v0, p0, Lbg;->b:Lbw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbg;->b:Lbw;

    invoke-virtual {v0}, Lbw;->a()V

    :cond_0
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    invoke-static {v0, p1, p0}, Lbk;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public final setCheckMarkDrawable(I)V
    .locals 1

    invoke-virtual {p0}, Lbg;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbg;->setCheckMarkDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Lhg;->a(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CheckedTextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/CheckedTextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lbg;->b:Lbw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbg;->b:Lbw;

    invoke-virtual {v0, p1, p2}, Lbw;->a(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
