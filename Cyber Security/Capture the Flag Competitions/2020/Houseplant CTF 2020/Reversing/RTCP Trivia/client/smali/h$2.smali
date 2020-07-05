.class final Lh$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh;


# direct methods
.method constructor <init>(Lh;)V
    .locals 0

    iput-object p1, p0, Lh$2;->a:Lh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lh$2;->a:Lh;

    iget v0, v0, Lh;->w:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh$2;->a:Lh;

    invoke-virtual {v0, v1}, Lh;->f(I)V

    :cond_0
    iget-object v0, p0, Lh$2;->a:Lh;

    iget v0, v0, Lh;->w:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_1

    iget-object v0, p0, Lh$2;->a:Lh;

    const/16 v2, 0x6c

    invoke-virtual {v0, v2}, Lh;->f(I)V

    :cond_1
    iget-object v0, p0, Lh$2;->a:Lh;

    iput-boolean v1, v0, Lh;->v:Z

    iget-object v0, p0, Lh$2;->a:Lh;

    iput v1, v0, Lh;->w:I

    return-void
.end method
