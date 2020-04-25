.class final Lhp$3;
.super Ljava/lang/Object;

# interfaces
.implements Lip;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhp;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhp;


# direct methods
.method constructor <init>(Lhp;)V
    .locals 0

    iput-object p1, p0, Lhp$3;->a:Lhp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()Lin;
    .locals 3

    iget-object v0, p0, Lhp$3;->a:Lhp;

    iget-object v0, v0, Lhp;->U:Liq;

    if-nez v0, :cond_0

    iget-object v0, p0, Lhp$3;->a:Lhp;

    new-instance v1, Liq;

    iget-object v2, p0, Lhp$3;->a:Lhp;

    iget-object v2, v2, Lhp;->V:Lip;

    invoke-direct {v1, v2}, Liq;-><init>(Lip;)V

    iput-object v1, v0, Lhp;->U:Liq;

    :cond_0
    iget-object v0, p0, Lhp$3;->a:Lhp;

    iget-object v0, v0, Lhp;->U:Liq;

    return-object v0
.end method
