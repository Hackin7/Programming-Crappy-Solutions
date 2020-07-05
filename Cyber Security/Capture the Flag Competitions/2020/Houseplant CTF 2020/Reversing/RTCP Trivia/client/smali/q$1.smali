.class final Lq$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq;->a(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq;


# direct methods
.method constructor <init>(Lq;)V
    .locals 0

    iput-object p1, p0, Lq$1;->a:Lq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq$1;->a:Lq;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lq;->a(Z)V

    iget-object v0, p0, Lq$1;->a:Lq;

    invoke-virtual {v0}, Lq;->invalidateSelf()V

    return-void
.end method
