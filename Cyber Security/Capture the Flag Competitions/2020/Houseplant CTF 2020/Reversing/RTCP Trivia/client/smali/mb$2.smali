.class final Lmb$2;
.super Lku;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb;->a(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:J

.field final synthetic d:Lmb;


# direct methods
.method varargs constructor <init>(Lmb;Ljava/lang/String;[Ljava/lang/Object;IJ)V
    .locals 0

    iput-object p1, p0, Lmb$2;->d:Lmb;

    iput p4, p0, Lmb$2;->a:I

    iput-wide p5, p0, Lmb$2;->c:J

    invoke-direct {p0, p2, p3}, Lku;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lmb$2;->d:Lmb;

    iget-object v0, v0, Lmb;->q:Lme;

    iget v1, p0, Lmb$2;->a:I

    iget-wide v2, p0, Lmb$2;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lme;->a(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object v0, p0, Lmb$2;->d:Lmb;

    invoke-static {v0}, Lmb;->a(Lmb;)V

    return-void
.end method
