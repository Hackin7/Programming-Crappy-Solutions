.class final Lcu$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcu;


# direct methods
.method constructor <init>(Lcu;)V
    .locals 0

    iput-object p1, p0, Lcu$1;->a:Lcu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcu$1;->a:Lcu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcu;->a(Z)V

    return-void
.end method
