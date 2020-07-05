.class final Lcg$e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcg;


# direct methods
.method constructor <init>(Lcg;)V
    .locals 0

    iput-object p1, p0, Lcg$e;->a:Lcg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcg$e;->a:Lcg;

    iget-object v0, v0, Lcg;->e:Lcc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcg$e;->a:Lcg;

    iget-object v0, v0, Lcg;->e:Lcc;

    invoke-static {v0}, Lgq;->m(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcg$e;->a:Lcg;

    iget-object v0, v0, Lcg;->e:Lcc;

    invoke-virtual {v0}, Lcc;->getCount()I

    move-result v0

    iget-object v1, p0, Lcg$e;->a:Lcg;

    iget-object v1, v1, Lcg;->e:Lcc;

    invoke-virtual {v1}, Lcc;->getChildCount()I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcg$e;->a:Lcg;

    iget-object v0, v0, Lcg;->e:Lcc;

    invoke-virtual {v0}, Lcc;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lcg$e;->a:Lcg;

    iget v1, v1, Lcg;->k:I

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcg$e;->a:Lcg;

    iget-object v0, v0, Lcg;->s:Landroid/widget/PopupWindow;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v0, p0, Lcg$e;->a:Lcg;

    invoke-virtual {v0}, Lcg;->b()V

    :cond_0
    return-void
.end method
