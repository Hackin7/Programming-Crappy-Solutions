.class final Lha$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:I

.field c:F

.field d:F

.field e:J

.field f:J

.field g:I

.field h:I

.field i:J

.field j:F

.field k:I


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lha$a;->e:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lha$a;->i:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lha$a;->f:J

    const/4 v0, 0x0

    iput v0, p0, Lha$a;->g:I

    iput v0, p0, Lha$a;->h:I

    return-void
.end method


# virtual methods
.method final a(J)F
    .locals 6

    iget-wide v0, p0, Lha$a;->e:J

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    return v1

    :cond_0
    iget-wide v2, p0, Lha$a;->i:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    const/high16 v2, 0x3f800000    # 1.0f

    if-ltz v0, :cond_2

    iget-wide v3, p0, Lha$a;->i:J

    cmp-long v0, p1, v3

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v3, p0, Lha$a;->i:J

    sub-long/2addr p1, v3

    iget v0, p0, Lha$a;->j:F

    sub-float v0, v2, v0

    iget v3, p0, Lha$a;->j:F

    long-to-float p1, p1

    iget p2, p0, Lha$a;->k:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {p1, v1, v2}, Lha;->a(FFF)F

    move-result p1

    mul-float/2addr v3, p1

    add-float/2addr v0, v3

    return v0

    :cond_2
    :goto_0
    iget-wide v3, p0, Lha$a;->e:J

    sub-long/2addr p1, v3

    const/high16 v0, 0x3f000000    # 0.5f

    long-to-float p1, p1

    iget p2, p0, Lha$a;->a:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-static {p1, v1, v2}, Lha;->a(FFF)F

    move-result p1

    mul-float/2addr v0, p1

    return v0
.end method
