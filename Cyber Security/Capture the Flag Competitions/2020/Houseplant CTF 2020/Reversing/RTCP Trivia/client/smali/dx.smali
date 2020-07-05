.class public final Ldx;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldx$a;,
        Ldx$b;,
        Ldx$c;
    }
.end annotation


# instance fields
.field public a:Lee;

.field final b:Ldy;

.field final c:Ldx$c;

.field public d:Ldx;

.field public e:I

.field f:I

.field g:I

.field h:I

.field public i:Ldt;

.field private j:I


# direct methods
.method public constructor <init>(Ldy;Ldx$c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lee;

    invoke-direct {v0, p0}, Lee;-><init>(Ldx;)V

    iput-object v0, p0, Ldx;->a:Lee;

    const/4 v0, 0x0

    iput v0, p0, Ldx;->e:I

    const/4 v1, -0x1

    iput v1, p0, Ldx;->f:I

    sget v1, Ldx$b;->a:I

    iput v1, p0, Ldx;->g:I

    sget v1, Ldx$a;->a:I

    iput v1, p0, Ldx;->j:I

    iput v0, p0, Ldx;->h:I

    iput-object p1, p0, Ldx;->b:Ldy;

    iput-object p2, p0, Ldx;->c:Ldx$c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ldx;->i:Ldt;

    if-nez v0, :cond_0

    new-instance v0, Ldt;

    sget v1, Ldt$a;->a:I

    invoke-direct {v0, v1}, Ldt;-><init>(I)V

    iput-object v0, p0, Ldx;->i:Ldt;

    return-void

    :cond_0
    iget-object v0, p0, Ldx;->i:Ldt;

    invoke-virtual {v0}, Ldt;->b()V

    return-void
.end method

.method public final a(Ldx;IIIIZ)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ldx;->d:Ldx;

    iput v1, p0, Ldx;->e:I

    const/4 p1, -0x1

    iput p1, p0, Ldx;->f:I

    sget p1, Ldx$b;->a:I

    iput p1, p0, Ldx;->g:I

    const/4 p1, 0x2

    iput p1, p0, Ldx;->h:I

    return v0

    :cond_0
    if-nez p6, :cond_a

    if-nez p1, :cond_2

    :cond_1
    :goto_0
    :pswitch_0
    move p6, v1

    goto/16 :goto_6

    :cond_2
    iget-object p6, p1, Ldx;->c:Ldx$c;

    iget-object v2, p0, Ldx;->c:Ldx$c;

    if-ne p6, v2, :cond_4

    iget-object p6, p0, Ldx;->c:Ldx$c;

    sget-object v2, Ldx$c;->f:Ldx$c;

    if-ne p6, v2, :cond_3

    iget-object p6, p1, Ldx;->b:Ldy;

    invoke-virtual {p6}, Ldy;->t()Z

    move-result p6

    if-eqz p6, :cond_1

    iget-object p6, p0, Ldx;->b:Ldy;

    invoke-virtual {p6}, Ldy;->t()Z

    move-result p6

    if-nez p6, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    move p6, v0

    goto/16 :goto_6

    :cond_4
    sget-object v2, Ldx$1;->a:[I

    iget-object v3, p0, Ldx;->c:Ldx$c;

    invoke-virtual {v3}, Ldx$c;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    iget-object p2, p0, Ldx;->c:Ldx$c;

    invoke-virtual {p2}, Ldx$c;->name()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_1
    sget-object v2, Ldx$c;->c:Ldx$c;

    if-eq p6, v2, :cond_6

    sget-object v2, Ldx$c;->e:Ldx$c;

    if-ne p6, v2, :cond_5

    goto :goto_2

    :cond_5
    move v2, v1

    goto :goto_3

    :cond_6
    :goto_2
    move v2, v0

    :goto_3
    iget-object v3, p1, Ldx;->b:Ldy;

    instance-of v3, v3, Lea;

    if-eqz v3, :cond_7

    if-nez v2, :cond_3

    sget-object v2, Ldx$c;->i:Ldx$c;

    if-ne p6, v2, :cond_1

    goto :goto_1

    :cond_7
    move p6, v2

    goto :goto_6

    :pswitch_2
    sget-object v2, Ldx$c;->b:Ldx$c;

    if-eq p6, v2, :cond_9

    sget-object v2, Ldx$c;->d:Ldx$c;

    if-ne p6, v2, :cond_8

    goto :goto_4

    :cond_8
    move v2, v1

    goto :goto_5

    :cond_9
    :goto_4
    move v2, v0

    :goto_5
    iget-object v3, p1, Ldx;->b:Ldy;

    instance-of v3, v3, Lea;

    if-eqz v3, :cond_7

    if-nez v2, :cond_3

    sget-object v2, Ldx$c;->h:Ldx$c;

    if-ne p6, v2, :cond_1

    goto :goto_1

    :pswitch_3
    sget-object v2, Ldx$c;->f:Ldx$c;

    if-eq p6, v2, :cond_1

    sget-object v2, Ldx$c;->h:Ldx$c;

    if-eq p6, v2, :cond_1

    sget-object v2, Ldx$c;->i:Ldx$c;

    if-eq p6, v2, :cond_1

    goto :goto_1

    :goto_6
    if-nez p6, :cond_a

    return v1

    :cond_a
    iput-object p1, p0, Ldx;->d:Ldx;

    if-lez p2, :cond_b

    iput p2, p0, Ldx;->e:I

    goto :goto_7

    :cond_b
    iput v1, p0, Ldx;->e:I

    :goto_7
    iput p3, p0, Ldx;->f:I

    iput p4, p0, Ldx;->g:I

    iput p5, p0, Ldx;->h:I

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()I
    .locals 2

    iget-object v0, p0, Ldx;->b:Ldy;

    iget v0, v0, Ldy;->Y:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Ldx;->f:I

    if-ltz v0, :cond_1

    iget-object v0, p0, Ldx;->d:Ldx;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldx;->d:Ldx;

    iget-object v0, v0, Ldx;->b:Ldy;

    iget v0, v0, Ldy;->Y:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Ldx;->f:I

    return v0

    :cond_1
    iget v0, p0, Ldx;->e:I

    return v0
.end method

.method public final c()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ldx;->d:Ldx;

    const/4 v0, 0x0

    iput v0, p0, Ldx;->e:I

    const/4 v1, -0x1

    iput v1, p0, Ldx;->f:I

    sget v1, Ldx$b;->b:I

    iput v1, p0, Ldx;->g:I

    iput v0, p0, Ldx;->h:I

    sget v0, Ldx$a;->a:I

    iput v0, p0, Ldx;->j:I

    iget-object v0, p0, Ldx;->a:Lee;

    invoke-virtual {v0}, Lee;->b()V

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Ldx;->d:Ldx;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ldx;->b:Ldy;

    iget-object v1, v1, Ldy;->Z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldx;->c:Ldx$c;

    invoke-virtual {v1}, Ldx$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
