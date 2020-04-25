.class final Laa$1;
.super Lgv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Laa;

.field private b:Z

.field private c:I


# direct methods
.method constructor <init>(Laa;)V
    .locals 0

    iput-object p1, p0, Laa$1;->a:Laa;

    invoke-direct {p0}, Lgv;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Laa$1;->b:Z

    iput p1, p0, Laa$1;->c:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Laa$1;->b:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Laa$1;->b:Z

    iget-object p1, p0, Laa$1;->a:Laa;

    iget-object p1, p1, Laa;->b:Lgu;

    if-eqz p1, :cond_1

    iget-object p1, p0, Laa$1;->a:Laa;

    iget-object p1, p1, Laa;->b:Lgu;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lgu;->a(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Laa$1;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Laa$1;->c:I

    iget-object v0, p0, Laa$1;->a:Laa;

    iget-object v0, v0, Laa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Laa$1;->a:Laa;

    iget-object p1, p1, Laa;->b:Lgu;

    if-eqz p1, :cond_0

    iget-object p1, p0, Laa$1;->a:Laa;

    iget-object p1, p1, Laa;->b:Lgu;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lgu;->b(Landroid/view/View;)V

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Laa$1;->c:I

    iput-boolean p1, p0, Laa$1;->b:Z

    iget-object v0, p0, Laa$1;->a:Laa;

    iput-boolean p1, v0, Laa;->c:Z

    :cond_1
    return-void
.end method
