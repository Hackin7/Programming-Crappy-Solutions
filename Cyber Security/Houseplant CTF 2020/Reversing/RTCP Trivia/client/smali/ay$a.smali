.class public final Lay$a;
.super Ljava/lang/Object;

# interfaces
.implements Lgu;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lay;

.field private c:Z


# direct methods
.method protected constructor <init>(Lay;)V
    .locals 0

    iput-object p1, p0, Lay$a;->b:Lay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lay$a;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lgt;I)Lay$a;
    .locals 1

    iget-object v0, p0, Lay$a;->b:Lay;

    iput-object p1, v0, Lay;->f:Lgt;

    iput p2, p0, Lay$a;->a:I

    return-object p0
.end method

.method public final a(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lay$a;->b:Lay;

    invoke-static {p1}, Lay;->a(Lay;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lay$a;->c:Z

    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lay$a;->c:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lay$a;->b:Lay;

    const/4 v0, 0x0

    iput-object v0, p1, Lay;->f:Lgt;

    iget-object p1, p0, Lay$a;->b:Lay;

    iget v0, p0, Lay$a;->a:I

    invoke-static {p1, v0}, Lay;->a(Lay;I)V

    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lay$a;->c:Z

    return-void
.end method
