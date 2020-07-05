.class final Lbv$b$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbv$b;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbv$b;


# direct methods
.method constructor <init>(Lbv$b;)V
    .locals 0

    iput-object p1, p0, Lbv$b$2;->a:Lbv$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    iget-object v0, p0, Lbv$b$2;->a:Lbv$b;

    iget-object v1, p0, Lbv$b$2;->a:Lbv$b;

    iget-object v1, v1, Lbv$b;->d:Lbv;

    invoke-static {v1}, Lgq;->m(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lbv$b;->c:Landroid/graphics/Rect;

    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lbv$b$2;->a:Lbv$b;

    invoke-virtual {v0}, Lbv$b;->c()V

    return-void

    :cond_1
    iget-object v0, p0, Lbv$b$2;->a:Lbv$b;

    invoke-virtual {v0}, Lbv$b;->a()V

    iget-object v0, p0, Lbv$b$2;->a:Lbv$b;

    invoke-static {v0}, Lbv$b;->a(Lbv$b;)V

    return-void
.end method
