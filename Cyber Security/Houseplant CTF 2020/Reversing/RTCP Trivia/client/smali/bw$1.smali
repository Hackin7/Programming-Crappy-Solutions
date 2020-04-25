.class final Lbw$1;
.super Lfc$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbw;->a(Landroid/content/Context;Lcr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lbw;


# direct methods
.method constructor <init>(Lbw;Ljava/lang/ref/WeakReference;)V
    .locals 0

    iput-object p1, p0, Lbw$1;->b:Lbw;

    iput-object p2, p0, Lbw$1;->a:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Lfc$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Typeface;)V
    .locals 3

    iget-object v0, p0, Lbw$1;->b:Lbw;

    iget-object v1, p0, Lbw$1;->a:Ljava/lang/ref/WeakReference;

    iget-boolean v2, v0, Lbw;->d:Z

    if-eqz v2, :cond_0

    iput-object p1, v0, Lbw;->c:Landroid/graphics/Typeface;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    iget v0, v0, Lbw;->b:I

    invoke-virtual {v1, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_0
    return-void
.end method
