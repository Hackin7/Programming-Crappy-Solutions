.class final Lcl$a;
.super Landroid/widget/BaseAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcl;


# direct methods
.method constructor <init>(Lcl;)V
    .locals 0

    iput-object p1, p0, Lcl$a;->a:Lcl;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lcl$a;->a:Lcl;

    iget-object v0, v0, Lcl;->b:Lcf;

    invoke-virtual {v0}, Lcf;->getChildCount()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcl$a;->a:Lcl;

    iget-object v0, v0, Lcl;->b:Lcf;

    invoke-virtual {v0, p1}, Lcf;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcl$b;

    iget-object p1, p1, Lcl$b;->a:Lc$b;

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p0, Lcl$a;->a:Lcl;

    invoke-virtual {p0, p1}, Lcl$a;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc$b;

    new-instance p3, Lcl$b;

    invoke-virtual {p2}, Lcl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, p2, v0, p1}, Lcl$b;-><init>(Lcl;Landroid/content/Context;Lc$b;)V

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Lcl$b;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance p1, Landroid/widget/AbsListView$LayoutParams;

    const/4 v0, -0x1

    iget p2, p2, Lcl;->e:I

    invoke-direct {p1, v0, p2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {p3, p1}, Lcl$b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    move-object p2, p3

    return-object p2

    :cond_0
    move-object p3, p2

    check-cast p3, Lcl$b;

    invoke-virtual {p0, p1}, Lcl$a;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc$b;

    iput-object p1, p3, Lcl$b;->a:Lc$b;

    invoke-virtual {p3}, Lcl$b;->a()V

    return-object p2
.end method
