.class final Lko$1;
.super Lko;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lko;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkh;

.field final synthetic b:J

.field final synthetic c:Lne;


# direct methods
.method constructor <init>(JLne;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lko$1;->a:Lkh;

    iput-wide p1, p0, Lko$1;->b:J

    iput-object p3, p0, Lko$1;->c:Lne;

    invoke-direct {p0}, Lko;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lko$1;->b:J

    return-wide v0
.end method

.method public final b()Lne;
    .locals 1

    iget-object v0, p0, Lko$1;->c:Lne;

    return-object v0
.end method
