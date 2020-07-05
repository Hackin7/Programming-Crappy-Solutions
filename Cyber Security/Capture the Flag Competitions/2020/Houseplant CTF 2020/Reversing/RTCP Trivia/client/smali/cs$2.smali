.class final Lcs$2;
.super Lgv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcs;->a(IJ)Lgt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcs;

.field private c:Z


# direct methods
.method constructor <init>(Lcs;I)V
    .locals 0

    iput-object p1, p0, Lcs$2;->b:Lcs;

    iput p2, p0, Lcs$2;->a:I

    invoke-direct {p0}, Lgv;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcs$2;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcs$2;->b:Lcs;

    iget-object p1, p1, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setVisibility(I)V

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lcs$2;->c:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcs$2;->b:Lcs;

    iget-object p1, p1, Lcs;->a:Landroidx/appcompat/widget/Toolbar;

    iget v0, p0, Lcs$2;->a:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcs$2;->c:Z

    return-void
.end method
