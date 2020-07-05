.class public final Lee;
.super Leg;


# instance fields
.field a:Ldx;

.field b:F

.field c:Lee;

.field d:F

.field e:Lee;

.field public f:F

.field g:I

.field private j:Lee;

.field private k:F

.field private l:Lef;

.field private m:I

.field private n:Lef;

.field private o:I


# direct methods
.method public constructor <init>(Ldx;)V
    .locals 2

    invoke-direct {p0}, Leg;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lee;->g:I

    const/4 v0, 0x0

    iput-object v0, p0, Lee;->l:Lef;

    const/4 v1, 0x1

    iput v1, p0, Lee;->m:I

    iput-object v0, p0, Lee;->n:Lef;

    iput v1, p0, Lee;->o:I

    iput-object p1, p0, Lee;->a:Ldx;

    return-void
.end method

.method private static a(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string p0, "DIRECT"

    return-object p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const-string p0, "CENTER"

    return-object p0

    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_2

    const-string p0, "MATCH"

    return-object p0

    :cond_2
    const/4 v0, 0x4

    if-ne p0, v0, :cond_3

    const-string p0, "CHAIN"

    return-object p0

    :cond_3
    const/4 v0, 0x5

    if-ne p0, v0, :cond_4

    const-string p0, "BARRIER"

    return-object p0

    :cond_4
    const-string p0, "UNCONNECTED"

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget v0, p0, Lee;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lee;->g:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lee;->l:Lef;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lee;->l:Lef;

    iget v0, v0, Lef;->i:I

    if-eq v0, v1, :cond_2

    return-void

    :cond_2
    iget v0, p0, Lee;->m:I

    int-to-float v0, v0

    iget-object v2, p0, Lee;->l:Lef;

    iget v2, v2, Lef;->a:F

    mul-float/2addr v0, v2

    iput v0, p0, Lee;->d:F

    :cond_3
    iget-object v0, p0, Lee;->n:Lef;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lee;->n:Lef;

    iget v0, v0, Lef;->i:I

    if-eq v0, v1, :cond_4

    return-void

    :cond_4
    iget v0, p0, Lee;->o:I

    int-to-float v0, v0

    iget-object v2, p0, Lee;->n:Lef;

    iget v2, v2, Lef;->a:F

    mul-float/2addr v0, v2

    iput v0, p0, Lee;->k:F

    :cond_5
    iget v0, p0, Lee;->g:I

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lee;->c:Lee;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lee;->c:Lee;

    iget v0, v0, Lee;->i:I

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lee;->c:Lee;

    if-nez v0, :cond_7

    iput-object p0, p0, Lee;->e:Lee;

    iget v0, p0, Lee;->d:F

    :goto_0
    iput v0, p0, Lee;->f:F

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lee;->c:Lee;

    iget-object v0, v0, Lee;->e:Lee;

    iput-object v0, p0, Lee;->e:Lee;

    iget-object v0, p0, Lee;->c:Lee;

    iget v0, v0, Lee;->f:F

    iget v1, p0, Lee;->d:F

    add-float/2addr v0, v1

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lee;->d()V

    return-void

    :cond_8
    iget v0, p0, Lee;->g:I

    const/4 v2, 0x2

    const-wide/16 v3, 0x1

    if-ne v0, v2, :cond_11

    iget-object v0, p0, Lee;->c:Lee;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lee;->c:Lee;

    iget v0, v0, Lee;->i:I

    if-ne v0, v1, :cond_11

    iget-object v0, p0, Lee;->j:Lee;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lee;->j:Lee;

    iget-object v0, v0, Lee;->c:Lee;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lee;->j:Lee;

    iget-object v0, v0, Lee;->c:Lee;

    iget v0, v0, Lee;->i:I

    if-ne v0, v1, :cond_11

    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v0

    iget-wide v5, v0, Ldr;->w:J

    add-long/2addr v5, v3

    iput-wide v5, v0, Ldr;->w:J

    :cond_9
    iget-object v0, p0, Lee;->c:Lee;

    iget-object v0, v0, Lee;->e:Lee;

    iput-object v0, p0, Lee;->e:Lee;

    iget-object v0, p0, Lee;->j:Lee;

    iget-object v2, p0, Lee;->j:Lee;

    iget-object v2, v2, Lee;->c:Lee;

    iget-object v2, v2, Lee;->e:Lee;

    iput-object v2, v0, Lee;->e:Lee;

    iget-object v0, p0, Lee;->a:Ldx;

    iget-object v0, v0, Ldx;->c:Ldx$c;

    sget-object v2, Ldx$c;->d:Ldx$c;

    const/4 v3, 0x0

    if-eq v0, v2, :cond_b

    iget-object v0, p0, Lee;->a:Ldx;

    iget-object v0, v0, Ldx;->c:Ldx$c;

    sget-object v2, Ldx$c;->e:Ldx$c;

    if-ne v0, v2, :cond_a

    goto :goto_2

    :cond_a
    move v1, v3

    :cond_b
    :goto_2
    if-eqz v1, :cond_c

    iget-object v0, p0, Lee;->c:Lee;

    iget v0, v0, Lee;->f:F

    iget-object v2, p0, Lee;->j:Lee;

    iget-object v2, v2, Lee;->c:Lee;

    :goto_3
    iget v2, v2, Lee;->f:F

    sub-float/2addr v0, v2

    goto :goto_4

    :cond_c
    iget-object v0, p0, Lee;->j:Lee;

    iget-object v0, v0, Lee;->c:Lee;

    iget v0, v0, Lee;->f:F

    iget-object v2, p0, Lee;->c:Lee;

    goto :goto_3

    :goto_4
    iget-object v2, p0, Lee;->a:Ldx;

    iget-object v2, v2, Ldx;->c:Ldx$c;

    sget-object v4, Ldx$c;->b:Ldx$c;

    if-eq v2, v4, :cond_e

    iget-object v2, p0, Lee;->a:Ldx;

    iget-object v2, v2, Ldx;->c:Ldx$c;

    sget-object v4, Ldx$c;->d:Ldx$c;

    if-ne v2, v4, :cond_d

    goto :goto_5

    :cond_d
    iget-object v2, p0, Lee;->a:Ldx;

    iget-object v2, v2, Ldx;->b:Ldy;

    invoke-virtual {v2}, Ldy;->m()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    iget-object v2, p0, Lee;->a:Ldx;

    iget-object v2, v2, Ldx;->b:Ldy;

    iget v2, v2, Ldy;->W:F

    goto :goto_6

    :cond_e
    :goto_5
    iget-object v2, p0, Lee;->a:Ldx;

    iget-object v2, v2, Ldx;->b:Ldy;

    invoke-virtual {v2}, Ldy;->l()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    iget-object v2, p0, Lee;->a:Ldx;

    iget-object v2, v2, Ldx;->b:Ldy;

    iget v2, v2, Ldy;->V:F

    :goto_6
    iget-object v4, p0, Lee;->a:Ldx;

    invoke-virtual {v4}, Ldx;->b()I

    move-result v4

    iget-object v5, p0, Lee;->j:Lee;

    iget-object v5, v5, Lee;->a:Ldx;

    invoke-virtual {v5}, Ldx;->b()I

    move-result v5

    iget-object v6, p0, Lee;->a:Ldx;

    iget-object v6, v6, Ldx;->d:Ldx;

    iget-object v7, p0, Lee;->j:Lee;

    iget-object v7, v7, Lee;->a:Ldx;

    iget-object v7, v7, Ldx;->d:Ldx;

    if-ne v6, v7, :cond_f

    const/high16 v2, 0x3f000000    # 0.5f

    move v5, v3

    goto :goto_7

    :cond_f
    move v3, v4

    :goto_7
    int-to-float v3, v3

    sub-float/2addr v0, v3

    int-to-float v4, v5

    sub-float/2addr v0, v4

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v1, :cond_10

    iget-object v1, p0, Lee;->j:Lee;

    iget-object v6, p0, Lee;->j:Lee;

    iget-object v6, v6, Lee;->c:Lee;

    iget v6, v6, Lee;->f:F

    add-float/2addr v6, v4

    mul-float v4, v0, v2

    add-float/2addr v6, v4

    iput v6, v1, Lee;->f:F

    iget-object v1, p0, Lee;->c:Lee;

    iget v1, v1, Lee;->f:F

    sub-float/2addr v1, v3

    sub-float/2addr v5, v2

    mul-float/2addr v0, v5

    sub-float/2addr v1, v0

    iput v1, p0, Lee;->f:F

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lee;->c:Lee;

    iget v1, v1, Lee;->f:F

    add-float/2addr v1, v3

    mul-float v3, v0, v2

    add-float/2addr v1, v3

    iput v1, p0, Lee;->f:F

    iget-object v1, p0, Lee;->j:Lee;

    iget-object v3, p0, Lee;->j:Lee;

    iget-object v3, v3, Lee;->c:Lee;

    iget v3, v3, Lee;->f:F

    sub-float/2addr v3, v4

    sub-float/2addr v5, v2

    mul-float/2addr v0, v5

    sub-float/2addr v3, v0

    iput v3, v1, Lee;->f:F

    :goto_8
    invoke-virtual {p0}, Lee;->d()V

    iget-object v0, p0, Lee;->j:Lee;

    invoke-virtual {v0}, Lee;->d()V

    return-void

    :cond_11
    iget v0, p0, Lee;->g:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_13

    iget-object v0, p0, Lee;->c:Lee;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lee;->c:Lee;

    iget v0, v0, Lee;->i:I

    if-ne v0, v1, :cond_13

    iget-object v0, p0, Lee;->j:Lee;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lee;->j:Lee;

    iget-object v0, v0, Lee;->c:Lee;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lee;->j:Lee;

    iget-object v0, v0, Lee;->c:Lee;

    iget v0, v0, Lee;->i:I

    if-ne v0, v1, :cond_13

    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-static {}, Ldq;->a()Ldr;

    move-result-object v0

    iget-wide v1, v0, Ldr;->x:J

    add-long/2addr v1, v3

    iput-wide v1, v0, Ldr;->x:J

    :cond_12
    iget-object v0, p0, Lee;->c:Lee;

    iget-object v0, v0, Lee;->e:Lee;

    iput-object v0, p0, Lee;->e:Lee;

    iget-object v0, p0, Lee;->j:Lee;

    iget-object v1, p0, Lee;->j:Lee;

    iget-object v1, v1, Lee;->c:Lee;

    iget-object v1, v1, Lee;->e:Lee;

    iput-object v1, v0, Lee;->e:Lee;

    iget-object v0, p0, Lee;->c:Lee;

    iget v0, v0, Lee;->f:F

    iget v1, p0, Lee;->d:F

    add-float/2addr v0, v1

    iput v0, p0, Lee;->f:F

    iget-object v0, p0, Lee;->j:Lee;

    iget-object v1, p0, Lee;->j:Lee;

    iget-object v1, v1, Lee;->c:Lee;

    iget v1, v1, Lee;->f:F

    iget-object v2, p0, Lee;->j:Lee;

    iget v2, v2, Lee;->d:F

    add-float/2addr v1, v2

    iput v1, v0, Lee;->f:F

    goto :goto_8

    :cond_13
    iget v0, p0, Lee;->g:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_14

    iget-object v0, p0, Lee;->a:Ldx;

    iget-object v0, v0, Ldx;->b:Ldy;

    invoke-virtual {v0}, Ldy;->c()V

    :cond_14
    return-void
.end method

.method final a(Ldq;)V
    .locals 4

    iget-object v0, p0, Lee;->a:Ldx;

    iget-object v0, v0, Ldx;->i:Ldt;

    iget-object v1, p0, Lee;->e:Lee;

    if-nez v1, :cond_0

    iget v1, p0, Lee;->f:F

    float-to-int v1, v1

    invoke-virtual {p1, v0, v1}, Ldq;->a(Ldt;I)V

    return-void

    :cond_0
    iget-object v1, p0, Lee;->e:Lee;

    iget-object v1, v1, Lee;->a:Ldx;

    invoke-virtual {p1, v1}, Ldq;->a(Ljava/lang/Object;)Ldt;

    move-result-object v1

    iget v2, p0, Lee;->f:F

    float-to-int v2, v2

    const/4 v3, 0x6

    invoke-virtual {p1, v0, v1, v2, v3}, Ldq;->c(Ldt;Ldt;II)Ldn;

    return-void
.end method

.method public final a(Lee;F)V
    .locals 1

    iget v0, p0, Lee;->i:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lee;->e:Lee;

    if-eq v0, p1, :cond_2

    iget v0, p0, Lee;->f:F

    cmpl-float v0, v0, p2

    if-eqz v0, :cond_2

    :cond_0
    iput-object p1, p0, Lee;->e:Lee;

    iput p2, p0, Lee;->f:F

    iget p1, p0, Lee;->i:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Lee;->c()V

    :cond_1
    invoke-virtual {p0}, Lee;->d()V

    :cond_2
    return-void
.end method

.method public final a(Lee;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lee;->g:I

    iput-object p1, p0, Lee;->c:Lee;

    int-to-float p1, p2

    iput p1, p0, Lee;->d:F

    iget-object p1, p0, Lee;->c:Lee;

    invoke-virtual {p1, p0}, Lee;->a(Leg;)V

    return-void
.end method

.method public final a(Lee;ILef;)V
    .locals 0

    iput-object p1, p0, Lee;->c:Lee;

    iget-object p1, p0, Lee;->c:Lee;

    invoke-virtual {p1, p0}, Lee;->a(Leg;)V

    iput-object p3, p0, Lee;->l:Lef;

    iput p2, p0, Lee;->m:I

    iget-object p1, p0, Lee;->l:Lef;

    invoke-virtual {p1, p0}, Lef;->a(Leg;)V

    return-void
.end method

.method public final b()V
    .locals 3

    invoke-super {p0}, Leg;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lee;->c:Lee;

    const/4 v1, 0x0

    iput v1, p0, Lee;->d:F

    iput-object v0, p0, Lee;->l:Lef;

    const/4 v2, 0x1

    iput v2, p0, Lee;->m:I

    iput-object v0, p0, Lee;->n:Lef;

    iput v2, p0, Lee;->o:I

    iput-object v0, p0, Lee;->e:Lee;

    iput v1, p0, Lee;->f:F

    iput v1, p0, Lee;->b:F

    iput-object v0, p0, Lee;->j:Lee;

    iput v1, p0, Lee;->k:F

    const/4 v0, 0x0

    iput v0, p0, Lee;->g:I

    return-void
.end method

.method public final b(Lee;F)V
    .locals 0

    iput-object p1, p0, Lee;->j:Lee;

    iput p2, p0, Lee;->k:F

    return-void
.end method

.method public final b(Lee;I)V
    .locals 0

    iput-object p1, p0, Lee;->c:Lee;

    int-to-float p1, p2

    iput p1, p0, Lee;->d:F

    iget-object p1, p0, Lee;->c:Lee;

    invoke-virtual {p1, p0}, Lee;->a(Leg;)V

    return-void
.end method

.method public final b(Lee;ILef;)V
    .locals 0

    iput-object p1, p0, Lee;->j:Lee;

    iput-object p3, p0, Lee;->n:Lef;

    iput p2, p0, Lee;->o:I

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lee;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lee;->e:Lee;

    if-ne v0, p0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lee;->a:Ldx;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", RESOLVED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lee;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]  type: "

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lee;->g:I

    invoke-static {v1}, Lee;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lee;->a:Ldx;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", RESOLVED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lee;->e:Lee;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lee;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "] type: "

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{ "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lee;->a:Ldx;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " UNRESOLVED} type: "

    goto :goto_0
.end method
