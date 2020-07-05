.class public final Ldp;
.super Ldn;


# direct methods
.method public constructor <init>(Ldo;)V
    .locals 0

    invoke-direct {p0, p1}, Ldn;-><init>(Ldo;)V

    return-void
.end method


# virtual methods
.method public final b(Ldt;)V
    .locals 1

    invoke-super {p0, p1}, Ldn;->b(Ldt;)V

    iget v0, p1, Ldt;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Ldt;->i:I

    return-void
.end method
