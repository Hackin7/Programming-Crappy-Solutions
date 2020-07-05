.class final Ln$2;
.super Lgv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln;


# direct methods
.method constructor <init>(Ln;)V
    .locals 0

    iput-object p1, p0, Ln$2;->a:Ln;

    invoke-direct {p0}, Lgv;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Ln$2;->a:Ln;

    const/4 v0, 0x0

    iput-object v0, p1, Ln;->n:Laa;

    iget-object p1, p0, Ln$2;->a:Ln;

    iget-object p1, p1, Ln;->c:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContainer;->requestLayout()V

    return-void
.end method
