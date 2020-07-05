.class final Lcg$c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcg;


# direct methods
.method constructor <init>(Lcg;)V
    .locals 0

    iput-object p1, p0, Lcg$c;->a:Lcg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcg$c;->a:Lcg;

    invoke-virtual {p1}, Lcg;->j()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcg$c;->a:Lcg;

    iget-object p1, p1, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcg$c;->a:Lcg;

    iget-object p1, p1, Lcg;->p:Landroid/os/Handler;

    iget-object p2, p0, Lcg$c;->a:Lcg;

    iget-object p2, p2, Lcg;->o:Lcg$e;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcg$c;->a:Lcg;

    iget-object p1, p1, Lcg;->o:Lcg$e;

    invoke-virtual {p1}, Lcg$e;->run()V

    :cond_0
    return-void
.end method
