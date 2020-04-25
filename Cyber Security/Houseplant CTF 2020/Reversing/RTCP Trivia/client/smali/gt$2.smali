.class final Lgt$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgt;->a(Lgw;)Lgt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgw;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lgt;


# direct methods
.method constructor <init>(Lgt;Lgw;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lgt$2;->c:Lgt;

    iput-object p2, p0, Lgt$2;->a:Lgw;

    iput-object p3, p0, Lgt$2;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 0

    iget-object p1, p0, Lgt$2;->a:Lgw;

    invoke-interface {p1}, Lgw;->a()V

    return-void
.end method
