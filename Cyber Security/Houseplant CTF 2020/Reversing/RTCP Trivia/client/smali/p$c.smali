.class final Lp$c;
.super Lp$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final a:Ljh;


# direct methods
.method constructor <init>(Ljh;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lp$f;-><init>(B)V

    iput-object p1, p0, Lp$c;->a:Ljh;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lp$c;->a:Ljh;

    invoke-virtual {v0}, Ljh;->start()V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lp$c;->a:Ljh;

    invoke-virtual {v0}, Ljh;->stop()V

    return-void
.end method
