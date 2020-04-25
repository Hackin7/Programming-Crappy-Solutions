.class public Ldn;
.super Ljava/lang/Object;

# interfaces
.implements Ldq$a;


# instance fields
.field a:Ldt;

.field public b:F

.field c:Z

.field public final d:Ldm;

.field public e:Z


# direct methods
.method public constructor <init>(Ldo;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ldn;->a:Ldt;

    const/4 v0, 0x0

    iput v0, p0, Ldn;->b:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldn;->c:Z

    iput-boolean v0, p0, Ldn;->e:Z

    new-instance v0, Ldm;

    invoke-direct {v0, p0, p1}, Ldm;-><init>(Ldn;Ldo;)V

    iput-object v0, p0, Ldn;->d:Ldm;

    return-void
.end method


# virtual methods
.method public final a(Ldq;I)Ldn;
    .locals 3

    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2}, Ldq;->a(I)Ldt;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Ldm;->a(Ldt;F)V

    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2}, Ldq;->a(I)Ldt;

    move-result-object p1

    const/high16 p2, -0x40800000    # -1.0f

    invoke-virtual {v0, p1, p2}, Ldm;->a(Ldt;F)V

    return-object p0
.end method

.method public final a(Ldt;Ldt;Ldt;I)Ldn;
    .locals 2

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    const/4 v0, -0x1

    mul-int/2addr p4, v0

    const/4 v0, 0x1

    :cond_0
    int-to-float p4, p4

    iput p4, p0, Ldn;->b:F

    :cond_1
    const/high16 p4, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {v0, p1, v1}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, p4}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p3, p4}, Ldm;->a(Ldt;F)V

    return-object p0

    :cond_2
    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {v0, p1, p4}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, v1}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p3, v1}, Ldm;->a(Ldt;F)V

    return-object p0
.end method

.method public final a(Ldt;Ldt;Ldt;Ldt;F)Ldn;
    .locals 2

    iget-object v0, p0, Ldn;->d:Ldm;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, p1, v1}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, v0}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p3, p5}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    neg-float p2, p5

    invoke-virtual {p1, p4, p2}, Ldm;->a(Ldt;F)V

    return-object p0
.end method

.method public final a([Z)Ldt;
    .locals 2

    iget-object v0, p0, Ldn;->d:Ldm;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ldm;->a([ZLdt;)Ldt;

    move-result-object p1

    return-object p1
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {v0}, Ldm;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Ldn;->a:Ldt;

    const/4 v0, 0x0

    iput v0, p0, Ldn;->b:F

    return-void
.end method

.method public final a(Ldq$a;)V
    .locals 5

    instance-of v0, p1, Ldn;

    if-eqz v0, :cond_0

    check-cast p1, Ldn;

    const/4 v0, 0x0

    iput-object v0, p0, Ldn;->a:Ldt;

    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {v0}, Ldm;->a()V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p1, Ldn;->d:Ldm;

    iget v1, v1, Ldm;->a:I

    if-ge v0, v1, :cond_0

    iget-object v1, p1, Ldn;->d:Ldm;

    invoke-virtual {v1, v0}, Ldm;->a(I)Ldt;

    move-result-object v1

    iget-object v2, p1, Ldn;->d:Ldm;

    invoke-virtual {v2, v0}, Ldm;->b(I)F

    move-result v2

    iget-object v3, p0, Ldn;->d:Ldm;

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v2, v4}, Ldm;->a(Ldt;FZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method final a(Ldt;)V
    .locals 5

    iget-object v0, p0, Ldn;->a:Ldt;

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldn;->d:Ldm;

    iget-object v2, p0, Ldn;->a:Ldt;

    invoke-virtual {v0, v2, v1}, Ldm;->a(Ldt;F)V

    const/4 v0, 0x0

    iput-object v0, p0, Ldn;->a:Ldt;

    :cond_0
    iget-object v0, p0, Ldn;->d:Ldm;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v2}, Ldm;->a(Ldt;Z)F

    move-result v0

    mul-float/2addr v0, v1

    iput-object p1, p0, Ldn;->a:Ldt;

    const/high16 p1, 0x3f800000    # 1.0f

    cmpl-float p1, v0, p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget p1, p0, Ldn;->b:F

    div-float/2addr p1, v0

    iput p1, p0, Ldn;->b:F

    iget-object p1, p0, Ldn;->d:Ldm;

    iget v1, p1, Ldm;->g:I

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-eq v1, v3, :cond_2

    iget v3, p1, Ldm;->a:I

    if-ge v2, v3, :cond_2

    iget-object v3, p1, Ldm;->f:[F

    aget v4, v3, v1

    div-float/2addr v4, v0

    aput v4, v3, v1

    iget-object v3, p1, Ldm;->e:[I

    aget v1, v3, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final b(Ldt;Ldt;Ldt;I)Ldn;
    .locals 2

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    if-gez p4, :cond_0

    const/4 v0, -0x1

    mul-int/2addr p4, v0

    const/4 v0, 0x1

    :cond_0
    int-to-float p4, p4

    iput p4, p0, Ldn;->b:F

    :cond_1
    const/high16 p4, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {v0, p1, v1}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, p4}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p3, v1}, Ldm;->a(Ldt;F)V

    return-object p0

    :cond_2
    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {v0, p1, p4}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, v1}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p3, p4}, Ldm;->a(Ldt;F)V

    return-object p0
.end method

.method public final b(Ldt;Ldt;Ldt;Ldt;F)Ldn;
    .locals 2

    iget-object v0, p0, Ldn;->d:Ldm;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, p3, v1}, Ldm;->a(Ldt;F)V

    iget-object p3, p0, Ldn;->d:Ldm;

    invoke-virtual {p3, p4, v1}, Ldm;->a(Ldt;F)V

    iget-object p3, p0, Ldn;->d:Ldm;

    const/high16 p4, -0x41000000    # -0.5f

    invoke-virtual {p3, p1, p4}, Ldm;->a(Ldt;F)V

    iget-object p1, p0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, p4}, Ldm;->a(Ldt;F)V

    neg-float p1, p5

    iput p1, p0, Ldn;->b:F

    return-object p0
.end method

.method public final b()Ldt;
    .locals 1

    iget-object v0, p0, Ldn;->a:Ldt;

    return-object v0
.end method

.method public b(Ldt;)V
    .locals 3

    iget v0, p1, Ldt;->c:I

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p1, Ldt;->c:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    const/high16 v1, 0x447a0000    # 1000.0f

    goto :goto_0

    :cond_1
    iget v0, p1, Ldt;->c:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    const v1, 0x49742400    # 1000000.0f

    goto :goto_0

    :cond_2
    iget v0, p1, Ldt;->c:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_3

    const v1, 0x4e6e6b28    # 1.0E9f

    goto :goto_0

    :cond_3
    iget v0, p1, Ldt;->c:I

    const/4 v2, 0x5

    if-ne v0, v2, :cond_4

    const v1, 0x5368d4a5    # 1.0E12f

    :cond_4
    :goto_0
    iget-object v0, p0, Ldn;->d:Ldm;

    invoke-virtual {v0, p1, v1}, Ldm;->a(Ldt;F)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    const-string v0, ""

    iget-object v1, p0, Ldn;->a:Ldt;

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "0"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ldn;->a:Ldt;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Ldn;->b:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ldn;->b:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    move v0, v4

    goto :goto_2

    :cond_1
    move-object v1, v0

    move v0, v3

    :goto_2
    iget-object v5, p0, Ldn;->d:Ldm;

    iget v5, v5, Ldm;->a:I

    :goto_3
    if-ge v3, v5, :cond_7

    iget-object v6, p0, Ldn;->d:Ldm;

    invoke-virtual {v6, v3}, Ldm;->a(I)Ldt;

    move-result-object v6

    if-eqz v6, :cond_6

    iget-object v7, p0, Ldn;->d:Ldm;

    invoke-virtual {v7, v3}, Ldm;->b(I)F

    move-result v7

    cmpl-float v8, v7, v2

    if-eqz v8, :cond_6

    invoke-virtual {v6}, Ldt;->toString()Ljava/lang/String;

    move-result-object v6

    const/high16 v9, -0x40800000    # -1.0f

    if-nez v0, :cond_2

    cmpg-float v0, v7, v2

    if-gez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "- "

    :goto_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    mul-float/2addr v7, v9

    goto :goto_5

    :cond_2
    if-lez v8, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    goto :goto_4

    :cond_4
    :goto_5
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v7, v0

    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " "

    goto :goto_6

    :goto_7
    move-object v1, v0

    move v0, v4

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_7
    if-nez v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "0.0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_8
    return-object v1
.end method
