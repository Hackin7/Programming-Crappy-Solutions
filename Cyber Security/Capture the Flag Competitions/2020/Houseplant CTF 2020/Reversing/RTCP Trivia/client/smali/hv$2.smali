.class final Lhv$2;
.super Lhv$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Lhp;

.field final synthetic c:Lhv;


# direct methods
.method constructor <init>(Lhv;Landroid/view/animation/Animation$AnimationListener;Landroid/view/ViewGroup;Lhp;)V
    .locals 0

    iput-object p1, p0, Lhv$2;->c:Lhv;

    iput-object p3, p0, Lhv$2;->a:Landroid/view/ViewGroup;

    iput-object p4, p0, Lhv$2;->b:Lhp;

    invoke-direct {p0, p2}, Lhv$b;-><init>(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    invoke-super {p0, p1}, Lhv$b;->onAnimationEnd(Landroid/view/animation/Animation;)V

    iget-object p1, p0, Lhv$2;->a:Landroid/view/ViewGroup;

    new-instance v0, Lhv$2$1;

    invoke-direct {v0, p0}, Lhv$2$1;-><init>(Lhv$2;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
