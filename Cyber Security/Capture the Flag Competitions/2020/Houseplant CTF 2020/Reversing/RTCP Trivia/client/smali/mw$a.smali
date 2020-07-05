.class final Lmw$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lmw;


# direct methods
.method constructor <init>(Lmw;)V
    .locals 0

    iput-object p1, p0, Lmw$a;->a:Lmw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lmw$a;->a:Lmw;

    iget-object v0, v0, Lmw;->g:Ljs;

    invoke-interface {v0}, Ljs;->a()V

    return-void
.end method
