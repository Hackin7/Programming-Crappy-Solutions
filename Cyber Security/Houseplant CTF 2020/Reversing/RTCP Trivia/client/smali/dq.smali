.class public final Ldq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldq$a;
    }
.end annotation


# static fields
.field public static h:Ldr; = null

.field private static i:I = 0x3e8


# instance fields
.field a:I

.field public b:Ldq$a;

.field public c:[Ldn;

.field public d:Z

.field e:I

.field public f:I

.field public final g:Ldo;

.field private j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ldt;",
            ">;"
        }
    .end annotation
.end field

.field private k:I

.field private l:I

.field private m:[Z

.field private n:I

.field private o:[Ldt;

.field private p:I

.field private q:[Ldn;

.field private final r:Ldq$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ldq;->a:I

    const/4 v1, 0x0

    iput-object v1, p0, Ldq;->j:Ljava/util/HashMap;

    const/16 v2, 0x20

    iput v2, p0, Ldq;->k:I

    iget v2, p0, Ldq;->k:I

    iput v2, p0, Ldq;->l:I

    iput-object v1, p0, Ldq;->c:[Ldn;

    iput-boolean v0, p0, Ldq;->d:Z

    iget v1, p0, Ldq;->k:I

    new-array v1, v1, [Z

    iput-object v1, p0, Ldq;->m:[Z

    const/4 v1, 0x1

    iput v1, p0, Ldq;->e:I

    iput v0, p0, Ldq;->f:I

    iget v1, p0, Ldq;->k:I

    iput v1, p0, Ldq;->n:I

    sget v1, Ldq;->i:I

    new-array v1, v1, [Ldt;

    iput-object v1, p0, Ldq;->o:[Ldt;

    iput v0, p0, Ldq;->p:I

    iget v0, p0, Ldq;->k:I

    new-array v0, v0, [Ldn;

    iput-object v0, p0, Ldq;->q:[Ldn;

    iget v0, p0, Ldq;->k:I

    new-array v0, v0, [Ldn;

    iput-object v0, p0, Ldq;->c:[Ldn;

    invoke-direct {p0}, Ldq;->g()V

    new-instance v0, Ldo;

    invoke-direct {v0}, Ldo;-><init>()V

    iput-object v0, p0, Ldq;->g:Ldo;

    new-instance v0, Ldp;

    iget-object v1, p0, Ldq;->g:Ldo;

    invoke-direct {v0, v1}, Ldp;-><init>(Ldo;)V

    iput-object v0, p0, Ldq;->b:Ldq$a;

    new-instance v0, Ldn;

    iget-object v1, p0, Ldq;->g:Ldo;

    invoke-direct {v0, v1}, Ldn;-><init>(Ldo;)V

    iput-object v0, p0, Ldq;->r:Ldq$a;

    return-void
.end method

.method public static a(Ldq;Ldt;Ldt;Ldt;FZ)Ldn;
    .locals 1

    invoke-virtual {p0}, Ldq;->c()Ldn;

    move-result-object v0

    if-eqz p5, :cond_0

    const/4 p5, 0x0

    invoke-virtual {v0, p0, p5}, Ldn;->a(Ldq;I)Ldn;

    :cond_0
    iget-object p0, v0, Ldn;->d:Ldm;

    const/high16 p5, -0x40800000    # -1.0f

    invoke-virtual {p0, p1, p5}, Ldm;->a(Ldt;F)V

    iget-object p0, v0, Ldn;->d:Ldm;

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p1, p4

    invoke-virtual {p0, p2, p1}, Ldm;->a(Ldt;F)V

    iget-object p0, v0, Ldn;->d:Ldm;

    invoke-virtual {p0, p3, p4}, Ldm;->a(Ldt;F)V

    return-object v0
.end method

.method public static a()Ldr;
    .locals 1

    sget-object v0, Ldq;->h:Ldr;

    return-object v0
.end method

.method private final b(Ldq$a;)I
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Ldq;->h:Ldr;

    const-wide/16 v2, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Ldq;->h:Ldr;

    iget-wide v4, v1, Ldr;->h:J

    add-long/2addr v4, v2

    iput-wide v4, v1, Ldr;->h:J

    :cond_0
    const/4 v1, 0x0

    move v4, v1

    :goto_0
    iget v5, v0, Ldq;->e:I

    if-ge v4, v5, :cond_1

    iget-object v5, v0, Ldq;->m:[Z

    aput-boolean v1, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    move v5, v1

    move v6, v5

    :goto_1
    if-nez v5, :cond_e

    sget-object v7, Ldq;->h:Ldr;

    if-eqz v7, :cond_2

    sget-object v7, Ldq;->h:Ldr;

    iget-wide v8, v7, Ldr;->i:J

    add-long/2addr v8, v2

    iput-wide v8, v7, Ldr;->i:J

    :cond_2
    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x2

    iget v8, v0, Ldq;->e:I

    mul-int/2addr v7, v8

    if-lt v6, v7, :cond_3

    return v6

    :cond_3
    invoke-interface/range {p1 .. p1}, Ldq$a;->b()Ldt;

    move-result-object v7

    if-eqz v7, :cond_4

    iget-object v7, v0, Ldq;->m:[Z

    invoke-interface/range {p1 .. p1}, Ldq$a;->b()Ldt;

    move-result-object v8

    iget v8, v8, Ldt;->a:I

    aput-boolean v4, v7, v8

    :cond_4
    iget-object v7, v0, Ldq;->m:[Z

    move-object/from16 v8, p1

    invoke-interface {v8, v7}, Ldq$a;->a([Z)Ldt;

    move-result-object v7

    if-eqz v7, :cond_6

    iget-object v9, v0, Ldq;->m:[Z

    iget v10, v7, Ldt;->a:I

    aget-boolean v9, v9, v10

    if-eqz v9, :cond_5

    return v6

    :cond_5
    iget-object v9, v0, Ldq;->m:[Z

    iget v10, v7, Ldt;->a:I

    aput-boolean v4, v9, v10

    :cond_6
    if-eqz v7, :cond_d

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v10, -0x1

    move v12, v9

    move v11, v10

    move v9, v1

    :goto_2
    iget v13, v0, Ldq;->f:I

    if-ge v9, v13, :cond_a

    iget-object v13, v0, Ldq;->c:[Ldn;

    aget-object v13, v13, v9

    iget-object v14, v13, Ldn;->a:Ldt;

    iget v14, v14, Ldt;->f:I

    sget v15, Ldt$a;->a:I

    if-eq v14, v15, :cond_9

    iget-boolean v14, v13, Ldn;->e:Z

    if-nez v14, :cond_9

    iget-object v14, v13, Ldn;->d:Ldm;

    iget v15, v14, Ldm;->g:I

    if-eq v15, v10, :cond_8

    iget v15, v14, Ldm;->g:I

    :goto_3
    if-eq v15, v10, :cond_8

    iget v4, v14, Ldm;->a:I

    if-ge v1, v4, :cond_8

    iget-object v4, v14, Ldm;->d:[I

    aget v4, v4, v15

    iget v2, v7, Ldt;->a:I

    if-ne v4, v2, :cond_7

    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    iget-object v2, v14, Ldm;->e:[I

    aget v15, v2, v15

    add-int/lit8 v1, v1, 0x1

    const-wide/16 v2, 0x1

    const/4 v4, 0x1

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_4
    if-eqz v1, :cond_9

    iget-object v1, v13, Ldn;->d:Ldm;

    invoke-virtual {v1, v7}, Ldm;->b(Ldt;)F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gez v2, :cond_9

    iget v2, v13, Ldn;->b:F

    neg-float v2, v2

    div-float/2addr v2, v1

    cmpg-float v1, v2, v12

    if-gez v1, :cond_9

    move v12, v2

    move v11, v9

    :cond_9
    add-int/lit8 v9, v9, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    const/4 v4, 0x1

    goto :goto_2

    :cond_a
    if-ltz v11, :cond_c

    iget-object v1, v0, Ldq;->c:[Ldn;

    aget-object v1, v1, v11

    iget-object v2, v1, Ldn;->a:Ldt;

    iput v10, v2, Ldt;->b:I

    sget-object v2, Ldq;->h:Ldr;

    if-eqz v2, :cond_b

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v3, v2, Ldr;->j:J

    const-wide/16 v9, 0x1

    add-long/2addr v3, v9

    iput-wide v3, v2, Ldr;->j:J

    goto :goto_5

    :cond_b
    const-wide/16 v9, 0x1

    :goto_5
    invoke-virtual {v1, v7}, Ldn;->a(Ldt;)V

    iget-object v2, v1, Ldn;->a:Ldt;

    iput v11, v2, Ldt;->b:I

    iget-object v2, v1, Ldn;->a:Ldt;

    invoke-virtual {v2, v1}, Ldt;->c(Ldn;)V

    move-wide v2, v9

    const/4 v1, 0x0

    const/4 v4, 0x1

    goto/16 :goto_1

    :cond_c
    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    :cond_d
    const/4 v4, 0x1

    const/4 v5, 0x1

    goto/16 :goto_1

    :cond_e
    return v6
.end method

.method public static b(Ljava/lang/Object;)I
    .locals 1

    check-cast p0, Ldx;

    iget-object p0, p0, Ldx;->i:Ldt;

    if-eqz p0, :cond_0

    iget p0, p0, Ldt;->d:F

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p0, v0

    float-to-int p0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private b(I)Ldt;
    .locals 3

    iget-object v0, p0, Ldq;->g:Ldo;

    iget-object v0, v0, Ldo;->b:Lds$a;

    invoke-interface {v0}, Lds$a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldt;

    if-nez v0, :cond_0

    new-instance v0, Ldt;

    invoke-direct {v0, p1}, Ldt;-><init>(I)V

    :goto_0
    iput p1, v0, Ldt;->f:I

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ldt;->b()V

    goto :goto_0

    :goto_1
    iget p1, p0, Ldq;->p:I

    sget v1, Ldq;->i:I

    if-lt p1, v1, :cond_1

    sget p1, Ldq;->i:I

    mul-int/lit8 p1, p1, 0x2

    sput p1, Ldq;->i:I

    iget-object p1, p0, Ldq;->o:[Ldt;

    sget v1, Ldq;->i:I

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ldt;

    iput-object p1, p0, Ldq;->o:[Ldt;

    :cond_1
    iget-object p1, p0, Ldq;->o:[Ldt;

    iget v1, p0, Ldq;->p:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ldq;->p:I

    aput-object v0, p1, v1

    return-object v0
.end method

.method private final b(Ldn;)V
    .locals 12

    iget v0, p0, Ldq;->f:I

    if-lez v0, :cond_3

    iget-object v0, p1, Ldn;->d:Ldm;

    iget-object v1, p0, Ldq;->c:[Ldn;

    iget v2, v0, Ldm;->g:I

    const/4 v3, 0x0

    :goto_0
    move v4, v3

    :goto_1
    const/4 v5, -0x1

    const/4 v6, 0x1

    if-eq v2, v5, :cond_2

    iget v7, v0, Ldm;->a:I

    if-ge v4, v7, :cond_2

    iget-object v7, v0, Ldm;->c:Ldo;

    iget-object v7, v7, Ldo;->c:[Ldt;

    iget-object v8, v0, Ldm;->d:[I

    aget v8, v8, v2

    aget-object v7, v7, v8

    iget v8, v7, Ldt;->b:I

    if-eq v8, v5, :cond_1

    iget-object v4, v0, Ldm;->f:[F

    aget v2, v4, v2

    invoke-virtual {v0, v7, v6}, Ldm;->a(Ldt;Z)F

    iget v4, v7, Ldt;->b:I

    aget-object v4, v1, v4

    iget-boolean v7, v4, Ldn;->e:Z

    if-nez v7, :cond_0

    iget-object v7, v4, Ldn;->d:Ldm;

    check-cast v7, Ldm;

    iget v8, v7, Ldm;->g:I

    move v9, v3

    :goto_2
    if-eq v8, v5, :cond_0

    iget v10, v7, Ldm;->a:I

    if-ge v9, v10, :cond_0

    iget-object v10, v0, Ldm;->c:Ldo;

    iget-object v10, v10, Ldo;->c:[Ldt;

    iget-object v11, v7, Ldm;->d:[I

    aget v11, v11, v8

    aget-object v10, v10, v11

    iget-object v11, v7, Ldm;->f:[F

    aget v11, v11, v8

    mul-float/2addr v11, v2

    invoke-virtual {v0, v10, v11, v6}, Ldm;->a(Ldt;FZ)V

    iget-object v10, v7, Ldm;->e:[I

    aget v8, v10, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_0
    iget v5, p1, Ldn;->b:F

    iget v6, v4, Ldn;->b:F

    mul-float/2addr v6, v2

    add-float/2addr v5, v6

    iput v5, p1, Ldn;->b:F

    iget-object v2, v4, Ldn;->a:Ldt;

    invoke-virtual {v2, p1}, Ldt;->b(Ldn;)V

    iget v2, v0, Ldm;->g:I

    goto :goto_0

    :cond_1
    iget-object v5, v0, Ldm;->e:[I

    aget v2, v5, v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    iget-object v0, p1, Ldn;->d:Ldm;

    iget v0, v0, Ldm;->a:I

    if-nez v0, :cond_3

    iput-boolean v6, p1, Ldn;->e:Z

    :cond_3
    return-void
.end method

.method private final c(Ldn;)V
    .locals 3

    iget-object v0, p0, Ldq;->c:[Ldn;

    iget v1, p0, Ldq;->f:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldq;->g:Ldo;

    iget-object v0, v0, Ldo;->a:Lds$a;

    iget-object v1, p0, Ldq;->c:[Ldn;

    iget v2, p0, Ldq;->f:I

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Lds$a;->a(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, Ldq;->c:[Ldn;

    iget v1, p0, Ldq;->f:I

    aput-object p1, v0, v1

    iget-object v0, p1, Ldn;->a:Ldt;

    iget v1, p0, Ldq;->f:I

    iput v1, v0, Ldt;->b:I

    iget v0, p0, Ldq;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ldq;->f:I

    iget-object v0, p1, Ldn;->a:Ldt;

    invoke-virtual {v0, p1}, Ldt;->c(Ldn;)V

    return-void
.end method

.method private f()V
    .locals 5

    iget v0, p0, Ldq;->k:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Ldq;->k:I

    iget-object v0, p0, Ldq;->c:[Ldn;

    iget v1, p0, Ldq;->k:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldn;

    iput-object v0, p0, Ldq;->c:[Ldn;

    iget-object v0, p0, Ldq;->g:Ldo;

    iget-object v1, p0, Ldq;->g:Ldo;

    iget-object v1, v1, Ldo;->c:[Ldt;

    iget v2, p0, Ldq;->k:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ldt;

    iput-object v1, v0, Ldo;->c:[Ldt;

    iget v0, p0, Ldq;->k:I

    new-array v0, v0, [Z

    iput-object v0, p0, Ldq;->m:[Z

    iget v0, p0, Ldq;->k:I

    iput v0, p0, Ldq;->l:I

    iget v0, p0, Ldq;->k:I

    iput v0, p0, Ldq;->n:I

    sget-object v0, Ldq;->h:Ldr;

    if-eqz v0, :cond_0

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v1, v0, Ldr;->d:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Ldr;->d:J

    sget-object v0, Ldq;->h:Ldr;

    sget-object v1, Ldq;->h:Ldr;

    iget-wide v1, v1, Ldr;->p:J

    iget v3, p0, Ldq;->k:I

    int-to-long v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iput-wide v1, v0, Ldr;->p:J

    sget-object v0, Ldq;->h:Ldr;

    sget-object v1, Ldq;->h:Ldr;

    iget-wide v1, v1, Ldr;->p:J

    iput-wide v1, v0, Ldr;->D:J

    :cond_0
    return-void
.end method

.method private g()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ldq;->c:[Ldn;

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ldq;->c:[Ldn;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iget-object v2, p0, Ldq;->g:Ldo;

    iget-object v2, v2, Ldo;->a:Lds$a;

    invoke-interface {v2, v1}, Lds$a;->a(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Ldq;->c:[Ldn;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(I)Ldt;
    .locals 5

    sget-object v0, Ldq;->h:Ldr;

    if-eqz v0, :cond_0

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v1, v0, Ldr;->m:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Ldr;->m:J

    :cond_0
    iget v0, p0, Ldq;->e:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ldq;->l:I

    if-lt v0, v1, :cond_1

    invoke-direct {p0}, Ldq;->f()V

    :cond_1
    sget v0, Ldt$a;->d:I

    invoke-direct {p0, v0}, Ldq;->b(I)Ldt;

    move-result-object v0

    iget v1, p0, Ldq;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ldq;->a:I

    iget v1, p0, Ldq;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ldq;->e:I

    iget v1, p0, Ldq;->a:I

    iput v1, v0, Ldt;->a:I

    iput p1, v0, Ldt;->c:I

    iget-object p1, p0, Ldq;->g:Ldo;

    iget-object p1, p1, Ldo;->c:[Ldt;

    iget v1, p0, Ldq;->a:I

    aput-object v0, p1, v1

    iget-object p1, p0, Ldq;->b:Ldq$a;

    invoke-interface {p1, v0}, Ldq$a;->b(Ldt;)V

    return-object v0
.end method

.method public final a(Ljava/lang/Object;)Ldt;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, Ldq;->e:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Ldq;->l:I

    if-lt v1, v2, :cond_1

    invoke-direct {p0}, Ldq;->f()V

    :cond_1
    instance-of v1, p1, Ldx;

    if-eqz v1, :cond_5

    check-cast p1, Ldx;

    iget-object v0, p1, Ldx;->i:Ldt;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ldx;->a()V

    iget-object p1, p1, Ldx;->i:Ldt;

    move-object v0, p1

    :cond_2
    iget p1, v0, Ldt;->a:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget p1, v0, Ldt;->a:I

    iget v2, p0, Ldq;->a:I

    if-gt p1, v2, :cond_3

    iget-object p1, p0, Ldq;->g:Ldo;

    iget-object p1, p1, Ldo;->c:[Ldt;

    iget v2, v0, Ldt;->a:I

    aget-object p1, p1, v2

    if-nez p1, :cond_5

    :cond_3
    iget p1, v0, Ldt;->a:I

    if-eq p1, v1, :cond_4

    invoke-virtual {v0}, Ldt;->b()V

    :cond_4
    iget p1, p0, Ldq;->a:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ldq;->a:I

    iget p1, p0, Ldq;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ldq;->e:I

    iget p1, p0, Ldq;->a:I

    iput p1, v0, Ldt;->a:I

    sget p1, Ldt$a;->a:I

    iput p1, v0, Ldt;->f:I

    iget-object p1, p0, Ldq;->g:Ldo;

    iget-object p1, p1, Ldo;->c:[Ldt;

    iget v1, p0, Ldq;->a:I

    aput-object v0, p1, v1

    :cond_5
    return-object v0
.end method

.method public final a(Ldn;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget-object v2, Ldq;->h:Ldr;

    const-wide/16 v3, 0x1

    if-eqz v2, :cond_1

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v5, v2, Ldr;->f:J

    add-long/2addr v5, v3

    iput-wide v5, v2, Ldr;->f:J

    iget-boolean v2, v1, Ldn;->e:Z

    if-eqz v2, :cond_1

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v5, v2, Ldr;->g:J

    add-long/2addr v5, v3

    iput-wide v5, v2, Ldr;->g:J

    :cond_1
    iget v2, v0, Ldq;->f:I

    const/4 v5, 0x1

    add-int/2addr v2, v5

    iget v6, v0, Ldq;->n:I

    if-ge v2, v6, :cond_2

    iget v2, v0, Ldq;->e:I

    add-int/2addr v2, v5

    iget v6, v0, Ldq;->l:I

    if-lt v2, v6, :cond_3

    :cond_2
    invoke-direct/range {p0 .. p0}, Ldq;->f()V

    :cond_3
    iget-boolean v2, v1, Ldn;->e:Z

    if-nez v2, :cond_1d

    invoke-direct/range {p0 .. p1}, Ldq;->b(Ldn;)V

    iget-object v2, v1, Ldn;->a:Ldt;

    const/4 v7, 0x0

    if-nez v2, :cond_4

    iget v2, v1, Ldn;->b:F

    cmpl-float v2, v2, v7

    if-nez v2, :cond_4

    iget-object v2, v1, Ldn;->d:Ldm;

    iget v2, v2, Ldm;->a:I

    if-nez v2, :cond_4

    move v2, v5

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_5

    return-void

    :cond_5
    iget v2, v1, Ldn;->b:F

    cmpg-float v2, v2, v7

    const/4 v8, -0x1

    if-gez v2, :cond_6

    iget v2, v1, Ldn;->b:F

    const/high16 v9, -0x40800000    # -1.0f

    mul-float/2addr v2, v9

    iput v2, v1, Ldn;->b:F

    iget-object v2, v1, Ldn;->d:Ldm;

    iget v10, v2, Ldm;->g:I

    const/4 v11, 0x0

    :goto_1
    if-eq v10, v8, :cond_6

    iget v12, v2, Ldm;->a:I

    if-ge v11, v12, :cond_6

    iget-object v12, v2, Ldm;->f:[F

    aget v13, v12, v10

    mul-float/2addr v13, v9

    aput v13, v12, v10

    iget-object v12, v2, Ldm;->e:[I

    aget v10, v12, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_6
    iget-object v2, v1, Ldn;->d:Ldm;

    iget v9, v2, Ldm;->g:I

    move v14, v7

    move/from16 v16, v14

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    :goto_2
    if-eq v9, v8, :cond_f

    iget v6, v2, Ldm;->a:I

    if-ge v11, v6, :cond_f

    iget-object v6, v2, Ldm;->f:[F

    aget v6, v6, v9

    iget-object v10, v2, Ldm;->c:Ldo;

    iget-object v10, v10, Ldo;->c:[Ldt;

    iget-object v8, v2, Ldm;->d:[I

    aget v8, v8, v9

    aget-object v8, v10, v8

    cmpg-float v10, v6, v7

    if-gez v10, :cond_7

    const v10, -0x457ced91    # -0.001f

    cmpl-float v10, v6, v10

    if-lez v10, :cond_8

    iget-object v6, v2, Ldm;->f:[F

    aput v7, v6, v9

    :goto_3
    iget-object v6, v2, Ldm;->b:Ldn;

    invoke-virtual {v8, v6}, Ldt;->b(Ldn;)V

    move v6, v7

    goto :goto_4

    :cond_7
    const v10, 0x3a83126f    # 0.001f

    cmpg-float v10, v6, v10

    if-gez v10, :cond_8

    iget-object v6, v2, Ldm;->f:[F

    aput v7, v6, v9

    goto :goto_3

    :cond_8
    :goto_4
    cmpl-float v10, v6, v7

    if-eqz v10, :cond_e

    iget v10, v8, Ldt;->f:I

    sget v3, Ldt$a;->a:I

    if-ne v10, v3, :cond_b

    if-nez v12, :cond_9

    :goto_5
    invoke-static {v8}, Ldm;->a(Ldt;)Z

    move-result v3

    move v15, v3

    :goto_6
    move v14, v6

    move-object v12, v8

    goto :goto_9

    :cond_9
    cmpl-float v3, v14, v6

    if-lez v3, :cond_a

    goto :goto_5

    :cond_a
    if-nez v15, :cond_e

    invoke-static {v8}, Ldm;->a(Ldt;)Z

    move-result v3

    if-eqz v3, :cond_e

    move v15, v5

    goto :goto_6

    :cond_b
    if-nez v12, :cond_e

    cmpg-float v3, v6, v7

    if-gez v3, :cond_e

    if-nez v13, :cond_c

    :goto_7
    invoke-static {v8}, Ldm;->a(Ldt;)Z

    move-result v3

    move/from16 v17, v3

    :goto_8
    move/from16 v16, v6

    move-object v13, v8

    goto :goto_9

    :cond_c
    cmpl-float v3, v16, v6

    if-lez v3, :cond_d

    goto :goto_7

    :cond_d
    if-nez v17, :cond_e

    invoke-static {v8}, Ldm;->a(Ldt;)Z

    move-result v3

    if-eqz v3, :cond_e

    move/from16 v17, v5

    goto :goto_8

    :cond_e
    :goto_9
    iget-object v3, v2, Ldm;->e:[I

    aget v9, v3, v9

    add-int/lit8 v11, v11, 0x1

    const-wide/16 v3, 0x1

    const/4 v8, -0x1

    goto/16 :goto_2

    :cond_f
    if-eqz v12, :cond_10

    goto :goto_a

    :cond_10
    move-object v12, v13

    :goto_a
    if-nez v12, :cond_11

    move v2, v5

    goto :goto_b

    :cond_11
    invoke-virtual {v1, v12}, Ldn;->a(Ldt;)V

    const/4 v2, 0x0

    :goto_b
    iget-object v3, v1, Ldn;->d:Ldm;

    iget v3, v3, Ldm;->a:I

    if-nez v3, :cond_12

    iput-boolean v5, v1, Ldn;->e:Z

    :cond_12
    if-eqz v2, :cond_19

    sget-object v2, Ldq;->h:Ldr;

    if-eqz v2, :cond_13

    sget-object v2, Ldq;->h:Ldr;

    iget-wide v3, v2, Ldr;->o:J

    const-wide/16 v8, 0x1

    add-long/2addr v3, v8

    iput-wide v3, v2, Ldr;->o:J

    :cond_13
    iget v2, v0, Ldq;->e:I

    add-int/2addr v2, v5

    iget v3, v0, Ldq;->l:I

    if-lt v2, v3, :cond_14

    invoke-direct/range {p0 .. p0}, Ldq;->f()V

    :cond_14
    sget v2, Ldt$a;->c:I

    invoke-direct {v0, v2}, Ldq;->b(I)Ldt;

    move-result-object v2

    iget v3, v0, Ldq;->a:I

    add-int/2addr v3, v5

    iput v3, v0, Ldq;->a:I

    iget v3, v0, Ldq;->e:I

    add-int/2addr v3, v5

    iput v3, v0, Ldq;->e:I

    iget v3, v0, Ldq;->a:I

    iput v3, v2, Ldt;->a:I

    iget-object v3, v0, Ldq;->g:Ldo;

    iget-object v3, v3, Ldo;->c:[Ldt;

    iget v4, v0, Ldq;->a:I

    aput-object v2, v3, v4

    iput-object v2, v1, Ldn;->a:Ldt;

    invoke-direct/range {p0 .. p1}, Ldq;->c(Ldn;)V

    iget-object v3, v0, Ldq;->r:Ldq$a;

    invoke-interface {v3, v1}, Ldq$a;->a(Ldq$a;)V

    iget-object v3, v0, Ldq;->r:Ldq$a;

    invoke-direct {v0, v3}, Ldq;->b(Ldq$a;)I

    iget v3, v2, Ldt;->b:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_18

    iget-object v3, v1, Ldn;->a:Ldt;

    if-ne v3, v2, :cond_16

    iget-object v3, v1, Ldn;->d:Ldm;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v2}, Ldm;->a([ZLdt;)Ldt;

    move-result-object v2

    if-eqz v2, :cond_16

    sget-object v3, Ldq;->h:Ldr;

    if-eqz v3, :cond_15

    sget-object v3, Ldq;->h:Ldr;

    iget-wide v8, v3, Ldr;->j:J

    const-wide/16 v10, 0x1

    add-long/2addr v8, v10

    iput-wide v8, v3, Ldr;->j:J

    :cond_15
    invoke-virtual {v1, v2}, Ldn;->a(Ldt;)V

    :cond_16
    iget-boolean v2, v1, Ldn;->e:Z

    if-nez v2, :cond_17

    iget-object v2, v1, Ldn;->a:Ldt;

    invoke-virtual {v2, v1}, Ldt;->c(Ldn;)V

    :cond_17
    iget v2, v0, Ldq;->f:I

    sub-int/2addr v2, v5

    iput v2, v0, Ldq;->f:I

    :cond_18
    move v6, v5

    goto :goto_c

    :cond_19
    const/4 v6, 0x0

    :goto_c
    iget-object v2, v1, Ldn;->a:Ldt;

    if-eqz v2, :cond_1b

    iget-object v2, v1, Ldn;->a:Ldt;

    iget v2, v2, Ldt;->f:I

    sget v3, Ldt$a;->a:I

    if-eq v2, v3, :cond_1a

    iget v2, v1, Ldn;->b:F

    cmpg-float v2, v2, v7

    if-ltz v2, :cond_1b

    :cond_1a
    move/from16 v18, v5

    goto :goto_d

    :cond_1b
    const/16 v18, 0x0

    :goto_d
    if-nez v18, :cond_1c

    return-void

    :cond_1c
    move/from16 v18, v6

    goto :goto_e

    :cond_1d
    const/16 v18, 0x0

    :goto_e
    if-nez v18, :cond_1e

    invoke-direct/range {p0 .. p1}, Ldq;->c(Ldn;)V

    :cond_1e
    return-void
.end method

.method public final a(Ldn;II)V
    .locals 0

    invoke-virtual {p0, p3}, Ldq;->a(I)Ldt;

    move-result-object p3

    iget-object p1, p1, Ldn;->d:Ldm;

    int-to-float p2, p2

    invoke-virtual {p1, p3, p2}, Ldm;->a(Ldt;F)V

    return-void
.end method

.method public final a(Ldq$a;)V
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Ldq;->h:Ldr;

    const-wide/16 v2, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Ldq;->h:Ldr;

    iget-wide v4, v1, Ldr;->t:J

    add-long/2addr v4, v2

    iput-wide v4, v1, Ldr;->t:J

    sget-object v1, Ldq;->h:Ldr;

    sget-object v4, Ldq;->h:Ldr;

    iget-wide v4, v4, Ldr;->u:J

    iget v6, v0, Ldq;->e:I

    int-to-long v6, v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v1, Ldr;->u:J

    sget-object v1, Ldq;->h:Ldr;

    sget-object v4, Ldq;->h:Ldr;

    iget-wide v4, v4, Ldr;->v:J

    iget v6, v0, Ldq;->f:I

    int-to-long v6, v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    iput-wide v4, v1, Ldr;->v:J

    :cond_0
    move-object/from16 v4, p1

    check-cast v4, Ldn;

    invoke-direct {v0, v4}, Ldq;->b(Ldn;)V

    const/4 v5, 0x0

    :goto_0
    iget v6, v0, Ldq;->f:I

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ge v5, v6, :cond_2

    iget-object v6, v0, Ldq;->c:[Ldn;

    aget-object v6, v6, v5

    iget-object v6, v6, Ldn;->a:Ldt;

    iget v6, v6, Ldt;->f:I

    sget v9, Ldt$a;->a:I

    if-eq v6, v9, :cond_1

    iget-object v6, v0, Ldq;->c:[Ldn;

    aget-object v6, v6, v5

    iget v6, v6, Ldn;->b:F

    cmpg-float v6, v6, v7

    if-gez v6, :cond_1

    move v5, v8

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_d

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_2
    if-nez v5, :cond_d

    sget-object v9, Ldq;->h:Ldr;

    if-eqz v9, :cond_3

    sget-object v9, Ldq;->h:Ldr;

    iget-wide v10, v9, Ldr;->k:J

    add-long/2addr v10, v2

    iput-wide v10, v9, Ldr;->k:J

    :cond_3
    add-int/2addr v6, v8

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v10, -0x1

    move v13, v9

    move v11, v10

    move v12, v11

    const/4 v9, 0x0

    const/4 v14, 0x0

    :goto_3
    iget v15, v0, Ldq;->f:I

    if-ge v9, v15, :cond_9

    iget-object v15, v0, Ldq;->c:[Ldn;

    aget-object v15, v15, v9

    iget-object v4, v15, Ldn;->a:Ldt;

    iget v4, v4, Ldt;->f:I

    sget v8, Ldt$a;->a:I

    if-eq v4, v8, :cond_8

    iget-boolean v4, v15, Ldn;->e:Z

    if-nez v4, :cond_8

    iget v4, v15, Ldn;->b:F

    cmpg-float v4, v4, v7

    if-gez v4, :cond_8

    const/4 v4, 0x1

    :goto_4
    iget v8, v0, Ldq;->e:I

    if-ge v4, v8, :cond_8

    iget-object v8, v0, Ldq;->g:Ldo;

    iget-object v8, v8, Ldo;->c:[Ldt;

    aget-object v8, v8, v4

    iget-object v2, v15, Ldn;->d:Ldm;

    invoke-virtual {v2, v8}, Ldm;->b(Ldt;)F

    move-result v2

    cmpg-float v3, v2, v7

    if-lez v3, :cond_7

    const/4 v3, 0x0

    :goto_5
    const/4 v7, 0x7

    if-ge v3, v7, :cond_7

    iget-object v7, v8, Ldt;->e:[F

    aget v7, v7, v3

    div-float/2addr v7, v2

    cmpg-float v16, v7, v13

    if-gez v16, :cond_4

    if-eq v3, v14, :cond_5

    :cond_4
    if-le v3, v14, :cond_6

    :cond_5
    move v14, v3

    move v12, v4

    move v13, v7

    move v11, v9

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_7
    add-int/lit8 v4, v4, 0x1

    const-wide/16 v2, 0x1

    const/4 v7, 0x0

    goto :goto_4

    :cond_8
    add-int/lit8 v9, v9, 0x1

    const-wide/16 v2, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    goto :goto_3

    :cond_9
    if-eq v11, v10, :cond_b

    iget-object v2, v0, Ldq;->c:[Ldn;

    aget-object v2, v2, v11

    iget-object v3, v2, Ldn;->a:Ldt;

    iput v10, v3, Ldt;->b:I

    sget-object v3, Ldq;->h:Ldr;

    if-eqz v3, :cond_a

    sget-object v3, Ldq;->h:Ldr;

    iget-wide v7, v3, Ldr;->j:J

    const-wide/16 v9, 0x1

    add-long/2addr v7, v9

    iput-wide v7, v3, Ldr;->j:J

    goto :goto_6

    :cond_a
    const-wide/16 v9, 0x1

    :goto_6
    iget-object v3, v0, Ldq;->g:Ldo;

    iget-object v3, v3, Ldo;->c:[Ldt;

    aget-object v3, v3, v12

    invoke-virtual {v2, v3}, Ldn;->a(Ldt;)V

    iget-object v3, v2, Ldn;->a:Ldt;

    iput v11, v3, Ldt;->b:I

    iget-object v3, v2, Ldn;->a:Ldt;

    invoke-virtual {v3, v2}, Ldt;->c(Ldn;)V

    goto :goto_7

    :cond_b
    const-wide/16 v9, 0x1

    const/4 v5, 0x1

    :goto_7
    iget v2, v0, Ldq;->e:I

    div-int/lit8 v2, v2, 0x2

    if-le v6, v2, :cond_c

    const/4 v5, 0x1

    :cond_c
    move-wide v2, v9

    const/4 v7, 0x0

    const/4 v8, 0x1

    goto/16 :goto_2

    :cond_d
    invoke-direct/range {p0 .. p1}, Ldq;->b(Ldq$a;)I

    invoke-virtual/range {p0 .. p0}, Ldq;->e()V

    return-void
.end method

.method public final a(Ldt;I)V
    .locals 4

    iget v0, p1, Ldt;->b:I

    iget v1, p1, Ldt;->b:I

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v1, v3, :cond_3

    iget-object v1, p0, Ldq;->c:[Ldn;

    aget-object v0, v1, v0

    iget-boolean v1, v0, Ldn;->e:Z

    if-eqz v1, :cond_0

    int-to-float p1, p2

    iput p1, v0, Ldn;->b:F

    return-void

    :cond_0
    iget-object v1, v0, Ldn;->d:Ldm;

    iget v1, v1, Ldm;->a:I

    if-nez v1, :cond_1

    iput-boolean v2, v0, Ldn;->e:Z

    int-to-float p1, p2

    iput p1, v0, Ldn;->b:F

    return-void

    :cond_1
    invoke-virtual {p0}, Ldq;->c()Ldn;

    move-result-object v0

    if-gez p2, :cond_2

    mul-int/2addr v3, p2

    int-to-float p2, v3

    iput p2, v0, Ldn;->b:F

    iget-object p2, v0, Ldn;->d:Ldm;

    const/high16 v1, 0x3f800000    # 1.0f

    :goto_0
    invoke-virtual {p2, p1, v1}, Ldm;->a(Ldt;F)V

    goto :goto_1

    :cond_2
    int-to-float p2, p2

    iput p2, v0, Ldn;->b:F

    iget-object p2, v0, Ldn;->d:Ldm;

    const/high16 v1, -0x40800000    # -1.0f

    goto :goto_0

    :goto_1
    invoke-virtual {p0, v0}, Ldq;->a(Ldn;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Ldq;->c()Ldn;

    move-result-object v0

    iput-object p1, v0, Ldn;->a:Ldt;

    int-to-float p2, p2

    iput p2, p1, Ldt;->d:F

    iput p2, v0, Ldn;->b:F

    iput-boolean v2, v0, Ldn;->e:Z

    invoke-virtual {p0, v0}, Ldq;->a(Ldn;)V

    return-void
.end method

.method public final a(Ldt;Ldt;IFLdt;Ldt;II)V
    .locals 6

    invoke-virtual {p0}, Ldq;->c()Ldn;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-ne p2, p5, :cond_0

    iget-object p3, v0, Ldn;->d:Ldm;

    invoke-virtual {p3, p1, v1}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p6, v1}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    const/high16 p3, -0x40000000    # -2.0f

    invoke-virtual {p1, p2, p3}, Ldm;->a(Ldt;F)V

    goto/16 :goto_1

    :cond_0
    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v2, p4, v2

    const/high16 v3, -0x40800000    # -1.0f

    if-nez v2, :cond_2

    iget-object p4, v0, Ldn;->d:Ldm;

    invoke-virtual {p4, p1, v1}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, v3}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p5, v3}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p6, v1}, Ldm;->a(Ldt;F)V

    if-gtz p3, :cond_1

    if-lez p7, :cond_6

    :cond_1
    neg-int p1, p3

    add-int/2addr p1, p7

    int-to-float p1, p1

    :goto_0
    iput p1, v0, Ldn;->b:F

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, p4, v2

    if-gtz v2, :cond_3

    iget-object p4, v0, Ldn;->d:Ldm;

    invoke-virtual {p4, p1, v3}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, v1}, Ldm;->a(Ldt;F)V

    int-to-float p1, p3

    goto :goto_0

    :cond_3
    cmpl-float v2, p4, v1

    if-ltz v2, :cond_4

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p5, v3}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p6, v1}, Ldm;->a(Ldt;F)V

    int-to-float p1, p7

    goto :goto_0

    :cond_4
    iget-object v2, v0, Ldn;->d:Ldm;

    sub-float v4, v1, p4

    mul-float v5, v1, v4

    invoke-virtual {v2, p1, v5}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    mul-float v2, v3, v4

    invoke-virtual {p1, p2, v2}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    mul-float/2addr v3, p4

    invoke-virtual {p1, p5, v3}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    mul-float/2addr v1, p4

    invoke-virtual {p1, p6, v1}, Ldm;->a(Ldt;F)V

    if-gtz p3, :cond_5

    if-lez p7, :cond_6

    :cond_5
    neg-int p1, p3

    int-to-float p1, p1

    mul-float/2addr p1, v4

    int-to-float p2, p7

    mul-float/2addr p2, p4

    add-float/2addr p1, p2

    goto :goto_0

    :cond_6
    :goto_1
    const/4 p1, 0x6

    if-eq p8, p1, :cond_7

    invoke-virtual {v0, p0, p8}, Ldn;->a(Ldq;I)Ldn;

    :cond_7
    invoke-virtual {p0, v0}, Ldq;->a(Ldn;)V

    return-void
.end method

.method public final a(Ldt;Ldt;II)V
    .locals 3

    invoke-virtual {p0}, Ldq;->c()Ldn;

    move-result-object v0

    invoke-virtual {p0}, Ldq;->d()Ldt;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Ldt;->c:I

    invoke-virtual {v0, p1, p2, v1, p3}, Ldn;->a(Ldt;Ldt;Ldt;I)Ldn;

    const/4 p1, 0x6

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, v1}, Ldm;->b(Ldt;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p2, p1

    float-to-int p1, p2

    invoke-virtual {p0, v0, p1, p4}, Ldq;->a(Ldn;II)V

    :cond_0
    invoke-virtual {p0, v0}, Ldq;->a(Ldn;)V

    return-void
.end method

.method public final a(Ldt;Ldt;Ldt;Ldt;F)V
    .locals 7

    invoke-virtual {p0}, Ldq;->c()Ldn;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ldn;->a(Ldt;Ldt;Ldt;Ldt;F)Ldn;

    invoke-virtual {p0, v6}, Ldq;->a(Ldn;)V

    return-void
.end method

.method public final b()V
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ldq;->g:Ldo;

    iget-object v2, v2, Ldo;->c:[Ldt;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ldq;->g:Ldo;

    iget-object v2, v2, Ldo;->c:[Ldt;

    aget-object v2, v2, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ldt;->b()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ldq;->g:Ldo;

    iget-object v1, v1, Ldo;->b:Lds$a;

    iget-object v2, p0, Ldq;->o:[Ldt;

    iget v3, p0, Ldq;->p:I

    invoke-interface {v1, v2, v3}, Lds$a;->a([Ljava/lang/Object;I)V

    iput v0, p0, Ldq;->p:I

    iget-object v1, p0, Ldq;->g:Ldo;

    iget-object v1, v1, Ldo;->c:[Ldt;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Ldq;->j:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    iget-object v1, p0, Ldq;->j:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :cond_2
    iput v0, p0, Ldq;->a:I

    iget-object v1, p0, Ldq;->b:Ldq$a;

    invoke-interface {v1}, Ldq$a;->a()V

    const/4 v1, 0x1

    iput v1, p0, Ldq;->e:I

    move v1, v0

    :goto_1
    iget v2, p0, Ldq;->f:I

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Ldq;->c:[Ldn;

    aget-object v2, v2, v1

    iput-boolean v0, v2, Ldn;->c:Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Ldq;->g()V

    iput v0, p0, Ldq;->f:I

    return-void
.end method

.method public final b(Ldt;Ldt;II)V
    .locals 3

    invoke-virtual {p0}, Ldq;->c()Ldn;

    move-result-object v0

    invoke-virtual {p0}, Ldq;->d()Ldt;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, Ldt;->c:I

    invoke-virtual {v0, p1, p2, v1, p3}, Ldn;->b(Ldt;Ldt;Ldt;I)Ldn;

    const/4 p1, 0x6

    if-eq p4, p1, :cond_0

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, v1}, Ldm;->b(Ldt;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p2, p1

    float-to-int p1, p2

    invoke-virtual {p0, v0, p1, p4}, Ldq;->a(Ldn;II)V

    :cond_0
    invoke-virtual {p0, v0}, Ldq;->a(Ldn;)V

    return-void
.end method

.method public final c()Ldn;
    .locals 2

    iget-object v0, p0, Ldq;->g:Ldo;

    iget-object v0, v0, Ldo;->a:Lds$a;

    invoke-interface {v0}, Lds$a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldn;

    if-nez v0, :cond_0

    new-instance v0, Ldn;

    iget-object v1, p0, Ldq;->g:Ldo;

    invoke-direct {v0, v1}, Ldn;-><init>(Ldo;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Ldn;->a:Ldt;

    iget-object v1, v0, Ldn;->d:Ldm;

    invoke-virtual {v1}, Ldm;->a()V

    const/4 v1, 0x0

    iput v1, v0, Ldn;->b:F

    const/4 v1, 0x0

    iput-boolean v1, v0, Ldn;->e:Z

    :goto_0
    invoke-static {}, Ldt;->a()V

    return-object v0
.end method

.method public final c(Ldt;Ldt;II)Ldn;
    .locals 3

    invoke-virtual {p0}, Ldq;->c()Ldn;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p3, :cond_1

    if-gez p3, :cond_0

    const/4 v1, -0x1

    mul-int/2addr p3, v1

    const/4 v1, 0x1

    :cond_0
    int-to-float p3, p3

    iput p3, v0, Ldn;->b:F

    :cond_1
    const/high16 p3, 0x3f800000    # 1.0f

    const/high16 v2, -0x40800000    # -1.0f

    if-nez v1, :cond_2

    iget-object v1, v0, Ldn;->d:Ldm;

    invoke-virtual {v1, p1, v2}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, p3}, Ldm;->a(Ldt;F)V

    goto :goto_0

    :cond_2
    iget-object v1, v0, Ldn;->d:Ldm;

    invoke-virtual {v1, p1, p3}, Ldm;->a(Ldt;F)V

    iget-object p1, v0, Ldn;->d:Ldm;

    invoke-virtual {p1, p2, v2}, Ldm;->a(Ldt;F)V

    :goto_0
    const/4 p1, 0x6

    if-eq p4, p1, :cond_3

    invoke-virtual {v0, p0, p4}, Ldn;->a(Ldq;I)Ldn;

    :cond_3
    invoke-virtual {p0, v0}, Ldq;->a(Ldn;)V

    return-object v0
.end method

.method public final d()Ldt;
    .locals 5

    sget-object v0, Ldq;->h:Ldr;

    if-eqz v0, :cond_0

    sget-object v0, Ldq;->h:Ldr;

    iget-wide v1, v0, Ldr;->n:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, v0, Ldr;->n:J

    :cond_0
    iget v0, p0, Ldq;->e:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Ldq;->l:I

    if-lt v0, v1, :cond_1

    invoke-direct {p0}, Ldq;->f()V

    :cond_1
    sget v0, Ldt$a;->c:I

    invoke-direct {p0, v0}, Ldq;->b(I)Ldt;

    move-result-object v0

    iget v1, p0, Ldq;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ldq;->a:I

    iget v1, p0, Ldq;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ldq;->e:I

    iget v1, p0, Ldq;->a:I

    iput v1, v0, Ldt;->a:I

    iget-object v1, p0, Ldq;->g:Ldo;

    iget-object v1, v1, Ldo;->c:[Ldt;

    iget v2, p0, Ldq;->a:I

    aput-object v0, v1, v2

    return-object v0
.end method

.method public final e()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ldq;->f:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Ldq;->c:[Ldn;

    aget-object v1, v1, v0

    iget-object v2, v1, Ldn;->a:Ldt;

    iget v1, v1, Ldn;->b:F

    iput v1, v2, Ldt;->d:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
