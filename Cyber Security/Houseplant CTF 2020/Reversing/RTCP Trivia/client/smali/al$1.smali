.class final Lal$1;
.super Ljava/lang/Object;

# interfaces
.implements Lge$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lal;->a(Lge;)Lft;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lal;


# direct methods
.method constructor <init>(Lal;)V
    .locals 0

    iput-object p1, p0, Lal$1;->a:Lal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lal$1;->a:Lal;

    iget-object v0, v0, Lal;->d:Laj;

    invoke-virtual {v0}, Laj;->g()V

    return-void
.end method
