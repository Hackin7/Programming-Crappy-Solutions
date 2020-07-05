.class final Lmw$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final a:I

.field final b:Lnf;


# direct methods
.method constructor <init>(Lnf;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lmw$c;->a:I

    iput-object p1, p0, Lmw$c;->b:Lnf;

    return-void
.end method
