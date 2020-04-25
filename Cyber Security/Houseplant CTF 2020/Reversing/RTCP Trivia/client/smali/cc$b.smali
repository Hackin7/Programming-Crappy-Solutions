.class final Lcc$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcc;


# direct methods
.method constructor <init>(Lcc;)V
    .locals 0

    iput-object p1, p0, Lcc$b;->a:Lcc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcc$b;->a:Lcc;

    const/4 v1, 0x0

    iput-object v1, v0, Lcc;->a:Lcc$b;

    iget-object v0, p0, Lcc$b;->a:Lcc;

    invoke-virtual {v0}, Lcc;->drawableStateChanged()V

    return-void
.end method
