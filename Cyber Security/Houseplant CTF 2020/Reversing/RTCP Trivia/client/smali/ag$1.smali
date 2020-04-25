.class final Lag$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lag;


# direct methods
.method constructor <init>(Lag;)V
    .locals 0

    iput-object p1, p0, Lag$1;->a:Lag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Lag$1;->a:Lag;

    invoke-virtual {v0}, Lag;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lag$1;->a:Lag;

    iget-object v0, v0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lag$1;->a:Lag;

    iget-object v0, v0, Lag;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lag$a;

    iget-object v0, v0, Lag$a;->a:Lci;

    iget-boolean v0, v0, Lcg;->r:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lag$1;->a:Lag;

    iget-object v0, v0, Lag;->d:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lag$1;->a:Lag;

    iget-object v0, v0, Lag;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lag$a;

    iget-object v1, v1, Lag$a;->a:Lci;

    invoke-virtual {v1}, Lci;->b()V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lag$1;->a:Lag;

    invoke-virtual {v0}, Lag;->c()V

    :cond_2
    return-void
.end method
