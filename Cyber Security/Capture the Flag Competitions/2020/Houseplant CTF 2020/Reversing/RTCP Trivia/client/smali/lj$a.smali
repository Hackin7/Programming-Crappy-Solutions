.class final Llj$a;
.super Lng;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field a:J


# direct methods
.method constructor <init>(Lnr;)V
    .locals 0

    invoke-direct {p0, p1}, Lng;-><init>(Lnr;)V

    return-void
.end method


# virtual methods
.method public final a_(Lnc;J)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lng;->a_(Lnc;J)V

    iget-wide v0, p0, Llj$a;->a:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Llj$a;->a:J

    return-void
.end method
