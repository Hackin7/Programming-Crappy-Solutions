.class final Lhq$a;
.super Lht;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lht<",
        "Lhq;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lhq;


# direct methods
.method public constructor <init>(Lhq;)V
    .locals 0

    iput-object p1, p0, Lhq$a;->a:Lhq;

    invoke-direct {p0, p1}, Lht;-><init>(Lhq;)V

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lhq$a;->a:Lhq;

    invoke-virtual {v0, p1}, Lhq;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lhq$a;->a:Lhq;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2, p3}, Lhq;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lhq$a;->a:Lhq;

    invoke-virtual {v0}, Lhq;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lhq$a;->a:Lhq;

    invoke-virtual {v0}, Lhq;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, Lhq$a;->a:Lhq;

    invoke-virtual {v0}, Lhq;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lhq$a;->a:Lhq;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lhq$a;->a:Lhq;

    invoke-virtual {v0}, Lhq;->a_()V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lhq$a;->a:Lhq;

    invoke-virtual {v0}, Lhq;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lhq$a;->a:Lhq;

    invoke-virtual {v0}, Lhq;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    return v0
.end method
