.class final Lbv$1;
.super Lce;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbv;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbv$b;

.field final synthetic b:Lbv;


# direct methods
.method constructor <init>(Lbv;Landroid/view/View;Lbv$b;)V
    .locals 0

    iput-object p1, p0, Lbv$1;->b:Lbv;

    iput-object p3, p0, Lbv$1;->a:Lbv$b;

    invoke-direct {p0, p2}, Lce;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()Lau;
    .locals 1

    iget-object v0, p0, Lbv$1;->a:Lbv$b;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lbv$1;->b:Lbv;

    iget-object v0, v0, Lbv;->a:Lbv$b;

    iget-object v0, v0, Lcg;->s:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbv$1;->b:Lbv;

    iget-object v0, v0, Lbv;->a:Lbv$b;

    invoke-virtual {v0}, Lbv$b;->b()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
