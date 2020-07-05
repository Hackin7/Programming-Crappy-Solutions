.class public final Lh$f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:Landroid/view/ViewGroup;

.field h:Landroid/view/View;

.field i:Landroid/view/View;

.field j:Laj;

.field k:Lah;

.field l:Landroid/content/Context;

.field m:Z

.field n:Z

.field o:Z

.field public p:Z

.field q:Z

.field r:Z

.field s:Landroid/os/Bundle;


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh$f;->a:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lh$f;->q:Z

    return-void
.end method


# virtual methods
.method final a(Laj;)V
    .locals 2

    iget-object v0, p0, Lh$f;->j:Laj;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh$f;->j:Laj;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh$f;->j:Laj;

    iget-object v1, p0, Lh$f;->k:Lah;

    invoke-virtual {v0, v1}, Laj;->b(Laq;)V

    :cond_1
    iput-object p1, p0, Lh$f;->j:Laj;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lh$f;->k:Lah;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lh$f;->k:Lah;

    invoke-virtual {p1, v0}, Laj;->a(Laq;)V

    :cond_2
    return-void
.end method
