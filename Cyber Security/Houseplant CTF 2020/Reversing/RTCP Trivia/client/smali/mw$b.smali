.class final Lmw$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final a:I

.field final b:Lnf;

.field final c:J


# direct methods
.method constructor <init>(Lnf;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x3e9

    iput v0, p0, Lmw$b;->a:I

    iput-object p1, p0, Lmw$b;->b:Lnf;

    const-wide/32 v0, 0xea60

    iput-wide v0, p0, Lmw$b;->c:J

    return-void
.end method
